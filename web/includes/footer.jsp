
<%-- 
   Copyright Robert Feather, Kevin Kowalsky, Tyler Wilson
--%>


<%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%  
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
%>
<section><p>&copy; Copyright <%= currentYear %> Robert Feather &amp;  Tyler Wilson</p></section>
</body>

</html>