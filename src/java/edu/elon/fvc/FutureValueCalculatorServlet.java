/*Copyright Erik Borchers and Chirs Gerenscer*/

package edu.elon.fvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.elon.investment.Investment;
import java.util.regex.Pattern;
import javax.servlet.http.HttpSession;

/**
 *
 * @author erikborchers
 */
public class FutureValueCalculatorServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
  throws ServletException, IOException {
    doPost(req, resp);
  }  
    
    
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
      String ivtAmt = request.getParameter("invAmt");
      String yrIR = request.getParameter("yearlyIR");
      String nOfYears = request.getParameter("nOfYears");
      // validate the parameters
      String doublePattern = ("[0-9]+(\\.){0,1}[0-9]*");
      String message;
      if ((Pattern.matches(doublePattern, ivtAmt)) == false ||
              (Pattern.matches(doublePattern, yrIR)) == false || 
              (Pattern.matches(doublePattern, nOfYears)) == false) {
        message = "Please properly supply the information";
        url = "/index.jsp";
        
      } else {
      double investmentAmt = Double.parseDouble(ivtAmt);
      double yearlyIR = Double.parseDouble(yrIR);
      int numberOfYears = Integer.parseInt(nOfYears);
      //set result equal to 0 to create Investment
      double result = 0.0;
      //store data in Investment object
      Investment investment = new Investment(investmentAmt, 
              yearlyIR, numberOfYears, result);
      //store investment oject in request
      Investment lastInvestment = new Investment(investmentAmt,
              yearlyIR,numberOfYears,0);
      HttpSession session = request.getSession();
      session.setAttribute("investment",lastInvestment);
      request.setAttribute("investment", investment);
      //forward request to jsp
      url = "/results.jsp";
      }
    }
    getServletContext()
              .getRequestDispatcher(url)
              .forward(request, response);
  }
}
