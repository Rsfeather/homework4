/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;


import java.io.Serializable;
import java.text.SimpleDateFormat;


import java.time.LocalDate;
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
 private Date dd;
    private String date;
    private String overdue;
   
     
    


 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
private Calendar c = Calendar.getInstance();


 



     
     
    public User() {
        firstname ="";
        lastname ="";
        email ="";
        title ="";
        name ="";
       overdue = "false";
        date = null;
          c.setTime(new Date()); 
c.add(Calendar.DATE, 14); 
    }
    
    public User (String firstname, String lastname, String email, String title, String date){
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.title = title;
        this.date = date;
        name = firstname + " " + lastname;
       
       overdue = "false";
       c.setTime(new Date()); 
c.add(Calendar.DATE, 14); 
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
    public void setName(String name){
        this.name=name;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
 
    public void setOverdue(String overdue){
        this.overdue=overdue;
    }
    public String getOverdue(){
        return overdue;
    }
    public Calendar getC() {
        return c;
    }
    public void setDd(Calendar c){
        this.c=c;
    }
}
