<%-- 
    Document   : information
    Created on : Dec 5, 2016, 10:51:33 AM
    Author     : rfeather
--%>
<%-- 
   Copyright Robert Feather,  Tyler Wilson
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="/includes/header.html" />
        
          
      

        <form action="library" method="post"> 
    
   
         <section class="navButtons">
           <h2>Checkout a book</h2>
           <input type="hidden" name="action" value="add"> 
             
             <section class="innerNavButtons">
               First Name:
         <input id="first" name="firstname" type="text"   autofocus required >
                  <br>
                  Last Name:
           <input id="last" name="lastname" type="text"   autofocus required >
                  <br>
                  Email Address:
   <input id="email" name="email" type="email"   
          required title="Your email address" required>
                  <br>
                  Book Title:
           <input id="title" name="title" type="text"   autofocus required >
                  <br>
          <input id="submit" type="submit" value="Checkout" name="Checout"  >
                </section>
            </section>
        </form>

<c:import url="/includes/footer.jsp" />
