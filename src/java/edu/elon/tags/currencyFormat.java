/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.elon.tags;
import java.io.IOException;
import java.text.NumberFormat;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
/**
 *
 * @author Kevin
 */
public class currencyFormat extends TagSupport {
    private double field;
    public void setField(double field){
        this.field = field;
    }
    
    @Override
  public int doStartTag() throws JspException {
      NumberFormat f = NumberFormat.getCurrencyInstance();

    try {
      JspWriter out = pageContext.getOut();
      out.print(f.format(field));
    } catch (IOException ioe) {
      System.out.println(ioe);
    }
    return SKIP_BODY;
  }
}
