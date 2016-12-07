<%-- 
    Document   : index
    Created on : Dec 5, 2016, 11:13:16 AM
    Author     : rfeather
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="/includes/header.html" />
    <section class="navButtons">
      <section class ="innerNavButtons">
        <a href="information.jsp">Check out a book</a>
        <br>
        
        <input type="hidden" name="action" value="display_users"> 
        <a href="books.jsp">Manage checked out books</a>
      </section>
    </section>    
 <c:import url="/includes/footer.jsp" />
