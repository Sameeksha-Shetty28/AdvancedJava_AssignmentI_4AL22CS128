package primenumber;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Display the form
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Check Prime Number</h2>");
        out.println("<form method='post' action='PrimeServlet'>");
        out.println("Enter a number: <input type='number' name='number' required>");
        out.println("<input type='submit' value='Check'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));
            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            out.println("<html><body>");
            out.println("<h2>Result:</h2>");
            out.println("<p>The number <strong>" + number + "</strong> is " +
                    (isPrime ? "<span style='color:green;'>a Prime Number</span>"
                             : "<span style='color:red;'>not a Prime Number</span>") + ".</p>");
            out.println("<a href='PrimeServlet'>Check another number</a>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            out.println("<html><body>");
            out.println("<p style='color:red;'>Invalid input! Please enter a valid integer.</p>");
            out.println("<a href='PrimeServlet'>Try Again</a>");
            out.println("</body></html>");
        }
    }
}
