<%-- 
    Document   : library
    Created on : Dec 5, 2016, 11:00:15 AM
    Author     : rfeather
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="/includes/header.html" />
        
<section class="navButtons">
    <h2>Currently checked out books</h2>
    <section class="innerNavButtons">
        <table>
         <tr>
          <th><b>Patron Name</b></th>
          <th><b>Email Address</b></th>
          <th><b>Book Title</b></th>
          <th><b>Due Date</b></th>
          <th><b>Overdue</b></th>
          </tr>
  <c:forEach var="user" items="${users}">
     
          
      
      
  <tr>
    <td>${user.name}</td>
    <td>${user.email}</td>
    <td>${user.title}</td>
   <td>${user.date}</td>
   <td>${user.overdue}</td>
    <td><a href="library?action=delete_user&amp;email=${user.email}">Delete</a></td>
  </tr>
  </c:forEach>
        </table>
  <br>
        <a href="index.jsp">Return to front page</a>
    </section>
</section>

    <c:import url="/includes/footer.jsp" />
