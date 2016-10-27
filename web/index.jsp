<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />

<html>
  <head>
    <title>Future Value Calculator</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>
    <form action="calculate" method="post">
      <input type="hidden" name="action" value="calculate">
      <label>Investment Amount</label>
      <input type="text" name="invAmt" required><br>
      <label>Yearly Interest Rate</label>
      <input type="text" name="yearlyIR" required><br>
      <label >Number of Years</label>
      <input type="text" name="nOfYears" required>        
      <br>
      <input type="submit" value="calculate">   
    </form>
  </body>
</html>

<c:import url="/includes/footer.jsp" />