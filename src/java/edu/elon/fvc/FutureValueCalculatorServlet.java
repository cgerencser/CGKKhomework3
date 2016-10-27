/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.elon.fvc;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.elon.investment.Investment;
   
/**
 *
 * @author erikborchers
 */
public class FutureValueCalculatorServlet extends HttpServlet {
  
  @Override
  protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
    
    String url = "/index.jsp";
    
    //get current action
    String action = request.getParameter("action");
    if (action == null) {
      action = "join";
    }
    
    //perform action
    if (action.equals("join")) {
      url = "/index.jsp";
    } else if (action.equals("calculate")) {
      double investmentAmt = Double.parseDouble(request.getParameter("invAmt"));
      double yearlyIR = Double.parseDouble(request.getParameter("yearlyIR"));
      double numberOfYears = Double.parseDouble(request.getParameter("nOfYears"));
      //set result equal to 0 to create Investment
      double result = 0.0;
      //store data in Investment object
      Investment investment = new Investment(investmentAmt, yearlyIR, numberOfYears, result);
      //store investment oject in request
      request.setAttribute("investment",investment);
      //forward request to jsp
      url = "/results.jsp";
      getServletContext()
              .getRequestDispatcher(url)
              .forward(request, response);
    
    }
  }
}