
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 843876
 */
public class ageCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request,response);
        }
    
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String ageString = request.getParameter("age");
        
        
        if(isNumber(ageString) && Integer.parseInt(ageString)>=0){
            request.setAttribute("message", "Your age next birthday will be " + (Integer.parseInt(ageString)+1));
        }
        else{
            request.setAttribute("message", "Invalid entry. Please enter valid number.");
        }
           
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    } 
   
//checks weather a string is a integer   
protected static boolean isNumber(String ageString){
    try{Integer.parseInt(ageString);
        return true;
    } catch(NumberFormatException e){
        return false;
    }
}


}
    

