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
import java.text.SimpleDateFormat;
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
    GregorianCalendar currentDate = new GregorianCalendar();
    private Calendar duedate= currentDate;
    
   
     private Date date = Calendar.getInstance().getTime();
    

private  Calendar calendar = new GregorianCalendar();

 



     SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
     
    public User() {
        firstname ="";
        lastname ="";
        email ="";
        title ="";
        name ="";
       
        
          duedate.add(Calendar.DAY_OF_YEAR, 14);
         
    }
    
    public User (String firstname, String lastname, String email, String title){
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.title = title;
        name = firstname + " " + lastname;
       duedate.add(Calendar.DAY_OF_YEAR, 14);
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
        return formatter.format(date);
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getDueDate(){
       return formatter.format(duedate);
       
    }
    
}
