/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Copyright Robert Feather,  Tyler Wilson
 */
package edu.elon.data;


import business.User;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import murach.data.UserDB;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
@WebServlet(name = "library", urlPatterns = {"/library"})
public class library extends HttpServlet {




        String firstname="";
        String lastname="";
        String email="";
        String title="";
        String fdate="";
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. 
      //  Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        doPost(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
 String url = "/index.jsp";
HttpSession session = request.getSession();
        
        // get current action
        String action = request.getParameter("action");
        
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.jsp";    // the "join" page
        } 
        else if (action.equals("add")) {
            // get parameters from the request
            firstname = request.getParameter("firstname");
            lastname = request.getParameter("lastname");
            email = request.getParameter("email");
            title = request.getParameter("title");
          // add 14 days to current date
            GregorianCalendar cal = new GregorianCalendar();
            cal.add(Calendar.MINUTE, 20160);
            Date date = cal.getTime();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            SimpleDateFormat format=new SimpleDateFormat("MM-dd-yyyy");
             fdate=format.format(sqlDate);
            
           
               User user = new User(firstname,lastname,email,title,fdate);
        request.setAttribute("user", user);
       UserDB.insert(user);
         url="/thankyou.jsp";
        }
       if (action.equals("display_users")) {            
            // get list of users
            ArrayList<User> users = UserDB.selectUsers();            

            // set as a request attribute
            request.setAttribute("users", users);
            // forward to index.jsp
            url = "/books.jsp";
        } 
        else if (action.equals("display_user")) {
            // get user for specified email
            String email = request.getParameter("email");
            User user = UserDB.selectUser(email);
            // set as session attribute
            session.setAttribute("user",user);
            // forward to user.jsp
            url = "/user.jsp";
        }
      
        else if (action.equals("delete_user")) {
            String email = request.getParameter("email");
            User user = UserDB.selectUser(email);
            UserDB.delete(user);
            ArrayList<User> users = UserDB.selectUsers();
            request.setAttribute("users", users);
          
            url="/books.jsp";
        }
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        
      
    }

    
   
}
