<%--Copyright Erik Borchers and Chirs Gerenscer--%>

<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="elon" uri="/WEB-INF/desc.tld" %>
<c:import url="/includes/header.html" />
<html>
  <head>
    <link href="styles/main.css" rel="stylesheet" type="text/css"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Results</title>
  </head>
  <body>
      
      <jsp:useBean id="investment" scope="request" class="edu.elon.investment.Investment"/>
      <label>Investment Amount:</label>
      <span><elon:currencyFormat field="${investment.investmentAmt}" /></span>
      <br>
      <label>Yearly Interest Rate: </label>
      <span><jsp:getProperty name="investment" property="yearlyIR"/></span>
      <br>
      <label>Number of Years: </label>
      <span><jsp:getProperty name="investment" property="numberOfYears"/></span>
      <br>     
      <label>Future Value: </label>
      <span><jsp:getProperty name="investment" property="calcFutureValue"/></span>
      
      <br>
      <a href="index.jsp">Return to Calculator</a>
      </html>
  </body>
<c:import url="/includes/footer.jsp" />

