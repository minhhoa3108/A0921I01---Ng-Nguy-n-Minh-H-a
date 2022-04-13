package controller;

import model.Customer;
import model.service.CustomerService;
import model.service.Impl.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    CustomerService customerService = new CustomerServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                // trả về một form thêm mới
                createCustomer(request, response);
                break;
            case "edit":
                // chỉnh sửax
//                    editEmployee(request, response);
                break;
            case "delete":
                    deleteCustomer(request, response);
                break;
            case "search":
                    search(request, response);
                break;
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int ma_khach_hang = Integer.parseInt(request.getParameter("ma_khach_hang"));

        boolean check = customerService.deleteCustomer(ma_khach_hang);

        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
        String ho_ten = request.getParameter("search_ho_ten");
        String email = request.getParameter("search_email");

        RequestDispatcher dispatcher = request.getRequestDispatcher("furama/Customer/list.jsp");
        request.setAttribute("customerList", customerService.search(ho_ten, email));

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        int ma_khach_hang = Integer.parseInt(request.getParameter("ma_khach_hang"));
        String ho_ten = request.getParameter("ho_ten");
        String ngay_sinh = request.getParameter("ngay_sinh");
        String so_cmnd = request.getParameter("so_cmnd");
        String so_dien_thoai = request.getParameter("so_dien_thoai");
        String email = request.getParameter("email");
        String dia_chi = request.getParameter("dia_chi");
        Customer newCustomer = new Customer(ma_khach_hang, ho_ten, ngay_sinh, so_cmnd, so_dien_thoai, email, dia_chi);
        List<String> messList =customerService.createCustomer(newCustomer);

        boolean check = true;
        for (String mess: messList) {
            if (!mess.equals("")){
                check =false;
            }
        }
        String mess = "Thêm mới thành công";
        if (!check) {
            mess = "Thêm mới KHÔNG thành công";
        }
        request.setAttribute("mess", mess);
        request.setAttribute("messList", messList);
        request.setAttribute("customerList", customerService.listAll());

        RequestDispatcher dispatcher = request.getRequestDispatcher("furama/Customer/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                // trả về một form thêm mới
                showFormCreate(request, response);
                break;
            case "edit":
                // chỉnh sửa
//                showEditForm(request, response);
                break;
            case "delete":
                break;
            case "search":
                break;
            default:
                showCustomer(request, response);
                // hien thi danh sách
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("furama/Customer/create.jsp");

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCustomer(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("furama/Customer/list.jsp");
        request.setAttribute("customerList", customerService.listAll());

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
