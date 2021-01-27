package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static util.utilities.isNumber;

/**
 *
 * @author Zennon Weleschuk
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String ageString = request.getParameter("age");

        if (isNumber(ageString) && Integer.parseInt(ageString) >= 0) {
            request.setAttribute("message", "Your age next birthday will be " + (Integer.parseInt(ageString) + 1));
        } else {
            request.setAttribute("message", "Invalid entry. Please enter valid number.");
        }

        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }



}
