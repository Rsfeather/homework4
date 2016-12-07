/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

   Copyright Robert Feather,  Tyler Wilson

 */
package business;


import java.io.Serializable;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Tyler
 */
public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String title;
    private String name;
private Date date2;
    private String date;
    private String overdue;
   String DATE_FORMAT_NOW = "MM-dd-yyyy";
 GregorianCalendar cal = new GregorianCalendar();
      GregorianCalendar cal2 = new GregorianCalendar();
            private Date date3;
 SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
 
      
    public User() {
        firstName ="";
        lastName ="";
        email ="";
        title ="";
        name ="";
     // sees if book is over due
        date = null;
       cal.add(Calendar.MINUTE, 20160);
        date2 = cal.getTime();
        date3 = cal2.getTime();
        if(date3.before(date2)){
            overdue="";
        }else{
            overdue="overdue";
        }
    }
    
    public User (String firstname, String lastname, String email,
            String title, String date){
        this.firstName = firstname;
        this.lastName = lastname;
        this.email = email;
        this.title = title;
        this.date = date;
        name = firstname + " " + lastname;
       
      // sees if book is over due
        cal.add(Calendar.MINUTE, 20160);
        date2 = cal.getTime();
        date3 = cal2.getTime();
        if(date3.before(date2)){
            overdue="";
        }else{
            overdue="overdue";
        }
    }
    //returns rifstname
    public String getFirstName() {
        return firstName;
    }
    // set firstname
    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }
    // return lastname
    public String getLastName() {
        return lastName;
    }
    //set lastname
    public void setLastName(String lastname) {
        this.lastName = lastname;
    }
    //return email
    public String getEmail() {
        return email;
    }
    //set email
    public void setEmail(String email) {
        this.email = email;
    }
    // return title
    public String getTitle() {
        return title;
    }
    // set title
    public void setTitle(String title) {
        this.title = title;
    }
    // return name
    public String getName() {
        return name;
    }
    //set name
    public void setName(String name){
        this.name=name;
    }
    // return date
    public String getDate(){
        return date;
    }
    // set date
    public void setDate(String date) {
        this.date = date;
    }
 // set overdue
    public void setOverdue(String overdue){
        this.overdue=overdue;
    }
    // return overdue
    public String getOverdue(){
        return overdue;
    }
   
}
