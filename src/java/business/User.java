/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.io.Serializable;

 import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Tyler
 */
public class User implements Serializable {
    private String firstname;
    private String lastname;
    private String email;
    private String title;
    private String name;
    private Date date; 
    private int year;
    private int day;
    private int month;
    private Date duedate;
     GregorianCalendar currentDate = new GregorianCalendar();
     Calendar cal = Calendar.getInstance();
    public User() {
        firstname ="";
        lastname ="";
        email ="";
        title ="";
        name ="";
       year = currentDate.get(Calendar.YEAR);
        day = currentDate.get(Calendar.DATE);
         month = currentDate.get(Calendar.MONTH);
         date = new Date(year,month,day);
         duedate = date;
         
    }
    
    public User (String firstname, String lastname, String email, String title){
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.title = title;
        name = firstname + " " + lastname;
        year = currentDate.get(Calendar.YEAR);
        day = currentDate.get(Calendar.DATE);
         month = currentDate.get(Calendar.MONTH);
         date = new Date(year,month,day);
    }
    
    public String getFirstName() {
        return firstname;
    }
    
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }
    
    public String getLastName() {
        return lastname;
    }
    
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getName() {
        return name;
    }
    public Date getDate(){
        return date;
    }
    public Date getDueDate(){
        return duedate;
        
    }
}
