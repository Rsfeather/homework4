<%-- 
    Document   : thankyou
    Created on : Dec 5, 2016, 10:55:23 AM
    Author     : rfeather
--%>
<%-- 
   Copyright Robert Feather,  Tyler Wilson
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="/includes/header.html" />
        
<section class="navButtons2"> 
    <section class="thankYou"> 
        Thank you for your patronage of the Belk Library. You've successfully
       checked out the book, ${user.title}.  Please note that this book is due 
       back on ${user.date} a friendly reminder will be sent to you if you your
        book becomes overdue
    </section>
      <a id="returnButton" href="index.jsp">Return to front page</a>
</section>
        
    <c:import url="/includes/footer.jsp" />
