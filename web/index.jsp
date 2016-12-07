<%-- 
    Document   : index
    Created on : Dec 5, 2016, 11:13:16 AM
    Author     : rfeather
--%>
<%-- 
   Copyright Robert Feather,  Tyler Wilson
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="/includes/header.html" />
    <section class="navButtons">
      <section class ="innerNavButtons">
        <a href="information.jsp">Check out a book</a>
        <br>
        
        
      <a href="library?action=display_users&amp;">Manage checked out books</a>
        <%-- 
  goes to servlet with action that calls display_user method
--%>
      </section>
    </section>    
 <c:import url="/includes/footer.jsp" />
