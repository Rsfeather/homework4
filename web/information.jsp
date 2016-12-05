<%-- 
    Document   : information
    Created on : Dec 5, 2016, 10:51:33 AM
    Author     : rfeather
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="/includes/header.html" />
        <h2>Checkout a book</h2>
        
         <form action="/library" method="post"> 
    
    
        
        
        First Name:
        <input name="firstname" type="text"   autofocus required >
        <br>
        Last Name
        <input name="lastname" type="text"   autofocus required >
        <br>
       Email Address:
        <input name="email" type="email"   required title="Your email address">
        <br>
       Book Title:
          <input name="title" type="text"   autofocus required >
          <br>
        <input type="submit" value="Checkout" name="Checout"  >
         </form>
<c:import url="/includes/footer.jsp" />
