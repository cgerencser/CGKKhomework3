<%--Copyright Erik Borchers and Chirs Gerenscer and Kevin Kowalsky--%>

<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="elon" uri="/WEB-INF/desc.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/includes/header.html" />

  <title>Results</title>
  </head>
  <body>
    <h1>Future Value Calculator</h1>    
    <jsp:useBean id="investment" scope="request" 
                 class="edu.elon.investment.Investment"/>
    <label>Investment Amount:</label>
    <span><elon:currencyFormat field="${investment.investmentAmt}" /></span>
    <br>
    <label>Yearly Interest Rate: </label>
    <span>${investment.yearlyIR}</span>
    <br>
    <label>Number of Years: </label>
    <span>${investment.numberOfYears}</span>
    <br>     
      <table id="result">
        <tr>
          <th><strong>Year</strong></th>
          <th><strong>Value</strong></th>
        </tr>
        <c:forEach var="things" items="${investment.allVals}">
        <tr>
          <td><elon:currencyFormat field="${things}" /> </td>
        </tr>
        </c:forEach>
      </table>
    <br>
    <a href="calculate">Return to Calculator</a>
    <br>
<c:import url="/includes/footer.jsp" />

