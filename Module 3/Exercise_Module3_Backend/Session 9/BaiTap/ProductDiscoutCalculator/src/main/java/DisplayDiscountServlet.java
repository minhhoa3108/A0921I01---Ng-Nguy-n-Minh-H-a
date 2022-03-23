import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DisplayDiscountServlet", urlPatterns = "/display-discout")
public class DisplayDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/HTML");

        String description = request.getParameter("description");
        float list_price = Float.parseFloat(request.getParameter("list_price"));
        float discount_percent = Float.parseFloat(request.getParameter("discount_percent"));

        PrintWriter printWriter = response.getWriter();
        float discount_amount;//số tiền được giảm
        float discount_price;//số tiền sau khi giảm giá

        discount_amount = (float) (list_price * discount_percent * 0.01);
        discount_price = list_price - discount_amount;

        printWriter.println("San pham:" + description + "<br>");
        printWriter.println("Gia niem yet la: " + list_price + "<br>");
        printWriter.println("Phan tram chiet khau: " + discount_percent + "%<br>");
        printWriter.println("So tien duoc giam: " + discount_amount + "<br>");
        printWriter.println("So tien phai tra la: " + discount_price + "<br>");
    }
}
