import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DictionaryServlet", urlPatterns = "/dictionary")
public class DictionaryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/HTML");
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("age", "Tuổi");
        dictionary.put("name", "Tên");
        dictionary.put("address", "Địa Chỉ");

        String search = request.getParameter("txtSearch");

        PrintWriter printWriter = response.getWriter();

        String result = dictionary.get(search);
        if(result != null){
            printWriter.println("Word: " + search);
            printWriter.println("Result: " + result);
        }else {
            printWriter.println("Not found");
        }
    }
}
