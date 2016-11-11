<!DOCTYPE html>
<%--Copyright Erik Borchers and Chirs Gerenscer--%>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:import url="/includes/header.html" />
  <title>Future Value Calculator</title>  
  </head>
  <body>
    <h1>Future Value Calculator</h1>    
    <form action="calculate" method="post">
      <input type="hidden" name="action" value="calculate">
      <table id="index">
        <tr>
          <td><label for="invAmt">Investment Amount:</label></td>
          <td><input type="number" name="invAmt" 
                     value="${investment.investmentAmt}" id="invAmt" 
                     required min="0"></td>
        </tr>
        <tr>
          <td><label>Yearly Interest Rate:</label></td>
          <td><input type="number" name="yearlyIR" 
                     value="${investment.yearlyIR}" required min="0"></td>
        </tr>
        <tr>
          <td><label id="year">Number of Years:</label></td>
          <td><input placeholder="Integer number of years" type="number" 
                     name="nOfYears" value="${investment.numberOfYears}" 
                     required min="0"></td>
        </tr>
      </table>  
      <input id="button" type="submit" value="calculate">   
      <br>
    </form>

    <c:import url="/includes/footer.jsp" />


