<!DOCTYPE html>
<%--Copyright Erik Borchers and Chirs Gerenscer--%>

<%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%  
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
%>
<hr>
<p>&copy; <%= currentYear %>, Erik Borchers and Chris Gerenscer</p>
</body>
</html>