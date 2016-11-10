<!DOCTYPE html>
<%--Copyright Erik Borchers and Chirs Gerenscer and Kevin Kowalsky--%>

<%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%  
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
%>
</body>
<footer>
<p>&copy; <%= currentYear %>, Kevin Kowalsky and Chris Gerenscer</p>
</footer>
</html>