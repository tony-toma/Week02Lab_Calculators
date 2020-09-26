/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                          .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstNumber = request.getParameter("firstNumber");
        String secondNumber = request.getParameter("secondNumber");
        String symbol = request.getParameter("symbol");
        
      if(firstNumber.equalsIgnoreCase("") || firstNumber == null || 
         secondNumber.equalsIgnoreCase("") || secondNumber == null) {
          request.setAttribute("result", "invalid input");
          getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
          
          return;
      }
      
      try {
          int numOne = Integer.parseInt(firstNumber);
          int numTwo = Integer.parseInt(secondNumber);
          int total = 0;
          
          switch(symbol) {
              case "*":
                  total = numOne * numTwo;
                  break;
              case "-":
                  total = numOne - numTwo;
                  break;
              case "+":
                  total = numOne + numTwo;
                  break;
              case "%":
                  total = numOne % numTwo;
                  break;
              default:
                  request.setAttribute("result", "invalid symbol");
                  break;
          }
          request.setAttribute("result", total);
          
      }
      catch(NumberFormatException e) {
          request.setAttribute("result", "invalid input");
          getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
          return;
      }
      
      
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
 
    }

}
