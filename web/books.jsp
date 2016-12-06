<%-- 
    Document   : library
    Created on : Dec 5, 2016, 11:00:15 AM
    Author     : rfeather
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="/includes/header.html" />
        <h2>Currently checked out books</h2>
        
  <c:forEach var="user" items="${users}">
  <tr>
    <td>${user.firstName}</td>
    <td>${user.lastName}</td>
    <td>${user.email}</td>
   
    <td><a href="userAdmin?action=delete_user&amp;email=${user.email}">Delete</a></td>
  </tr>
  </c:forEach>
        <a href="index.jsp">Return to front page</a>
    <c:import url="/includes/footer.jsp" />
