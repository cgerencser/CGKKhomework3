<%-- 
    Document   : results
    Created on : Oct 26, 2016, 3:28:32 PM
    Author     : erikborchers
--%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Results</title>
  </head>
  <body>
      <jsp:useBean id="investment" scope="request" class="edu.elon.investment.Investment"/>
      <label>Investment Amount:</label>
      <span><jsp:getProperty name="investment" property="investmentAmt"/></span>
      <br>
      <label>Yearly Interest Rate: </label>
      <span><jsp:getProperty name="investment" property="yearlyIR"/></span>
      <br>
      <label>Number of Years: </label>
      <span><jsp:getProperty name="investment" property="numberOfYears"/></span>
      <br>     
      <label>Future Value: </label>
      <span><jsp:getProperty name="investment" property="calcFutureValue"/></span>
      
  </body>
</html>
<c:import url="/includes/footer.jsp" />
