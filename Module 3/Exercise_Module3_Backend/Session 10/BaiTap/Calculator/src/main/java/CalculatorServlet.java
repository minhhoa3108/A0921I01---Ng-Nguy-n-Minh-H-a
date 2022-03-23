import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculate")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/HTML;charset=UTF-8");

        float firstOperator = Float.parseFloat(request.getParameter("first-operand"));
        float secondOperator = Float.parseFloat(request.getParameter("second-operand"));
        char operator = request.getParameter("operator").charAt(0);

        PrintWriter printWriter = response.getWriter();

        try{
            float result = Calculator.calculate(firstOperator, secondOperator, operator);
            printWriter.println(firstOperator + " " + operator + " " + secondOperator + " " + " = " + result);
        }catch (Exception e){
            printWriter.println("Error: " + e.getMessage());
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
