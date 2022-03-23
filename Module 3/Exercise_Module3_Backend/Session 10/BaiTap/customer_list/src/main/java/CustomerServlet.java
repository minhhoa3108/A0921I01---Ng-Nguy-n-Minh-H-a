import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer-list")
public class CustomerServlet extends HttpServlet {
    private static List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer(1, "Hoan", "1/2/2002", "Da Nang", true));
        customerList.add(new Customer(2, "Hung", "1/2/2002", "Da Nang", true));
        customerList.add(new Customer(3, "Trung", "1/2/2002", "Da Nang", false));
        customerList.add(new Customer(4, "Toan", "1/2/2002", "Da Nang", false));
        customerList.add(new Customer(5, "Thang", "1/2/2002", "Da Nang", true));
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/customer-list.jsp");
        request.setAttribute("customerList", customerList);
        requestDispatcher.forward(request, response);
    }
}
