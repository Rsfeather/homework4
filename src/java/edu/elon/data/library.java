/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.elon.data;

import business.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "library", urlPatterns = {"/library"})
public class library extends HttpServlet {




        String firstname="";
        String lastname="";
        String email="";
        String title;

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 String url = "/thankyou.jsp";

        
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
            firstname = request.getParameter("first");
            lastname = request.getParameter("last");
            email = request.getParameter("email");
            title = request.getParameter("title");
               User user = new User(firstname,lastname,email,title);
        request.setAttribute("user", user);
        HttpSession session = request.getSession();
        session.setAttribute("title", title);
        session.setAttribute("date", "latter");
        }
        
     
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        
      
    }

    
   
}
