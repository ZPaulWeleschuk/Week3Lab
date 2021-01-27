
package Servlet;

import static util.utilities.isNumber;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Zennon Weleschuk
 */

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request,response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String number1String = request.getParameter("number1");
        String number2String = request.getParameter("number2");
        String operation = request.getParameter("action");
        
        request.setAttribute("number1", number1String);
        request.setAttribute("number2", number2String);
        
        if(isNumber(number1String)&& isNumber(number2String)){ //see ageCalculatorServlet for isNumber method
            if (operation.equals("+")){request.setAttribute("message", Integer.parseInt(number1String) + Integer.parseInt(number2String));} 
            else if(operation.equals("-")){request.setAttribute("message", Integer.parseInt(number1String) - Integer.parseInt(number2String));}
            else if(operation.equals("*")){request.setAttribute("message", Integer.parseInt(number1String) * Integer.parseInt(number2String));}
            else if(operation.equals("%")){request.setAttribute("message", Integer.parseInt(number1String) % Integer.parseInt(number2String));}
            else {request.setAttribute("message", "--");}        
        }
        else{
            request.setAttribute("message", "invalid entry. Please enter valid number.");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            return;
        }
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }


}