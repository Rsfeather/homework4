/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;


import java.io.Serializable;

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

    private String date;
    private String overdue;
   
 
     
    public User() {
        firstName ="";
        lastName ="";
        email ="";
        title ="";
        name ="";
       overdue = "false";
        date = null;
        
    }
    
    public User (String firstname, String lastname, String email, String title, String date){
        this.firstName = firstname;
        this.lastName = lastname;
        this.email = email;
        this.title = title;
        this.date = date;
        name = firstname + " " + lastname;
       
       overdue = "false";
       
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastname) {
        this.lastName = lastname;
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
   
}
