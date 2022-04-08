package controller;

import model.Employee;
import model.service.EmployeeService;
import model.service.Impl.EmployeeServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {
    private EmployeeService employeeService = new EmployeeServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        try{
            switch (action) {
                case "create":
                    // trả về một form thêm mới
                    createEmployee(request, response);
                    break;
                case "edit":
                    // chỉnh sửax
                    editEmployee(request, response);
                    break;
                case "delete":
                    deleteEmployee(request, response);
                    break;
                case "search":
                    search(request, response);
                    break;
            }
        }catch (SQLException ex) {
            throw new ServletException(ex);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
        String ho_ten = request.getParameter("search_ho_ten");
        String email = request.getParameter("search_email");

        RequestDispatcher dispatcher = request.getRequestDispatcher("furama/Employee/list.jsp");
        request.setAttribute("employeeList", employeeService.search(ho_ten, email));

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editEmployee(HttpServletRequest request, HttpServletResponse response) throws ParseException, ServletException, IOException {
        int ma_nhan_vien = Integer.parseInt(request.getParameter("ma_nhan_vien"));
        String ho_ten = request.getParameter("ho_ten");
        String ngay_sinh = request.getParameter("ngay_sinh");
        String so_cmnd = request.getParameter("so_cmnd");
        double luong = Double.parseDouble(request.getParameter("luong"));
        String so_dien_thoai = request.getParameter("so_dien_thoai");
        String email = request.getParameter("email");
        String dia_chi = request.getParameter("dia_chi");
        Employee updateEmployee = new Employee(ma_nhan_vien, ho_ten, ngay_sinh, so_cmnd, luong, so_dien_thoai, email, dia_chi);

        employeeService.editEmployee(updateEmployee);
        request.setAttribute("employeeList", employeeService.listEmployee());

        RequestDispatcher dispatcher = request.getRequestDispatcher("furama/Employee/list.jsp");
        dispatcher.forward(request, response);
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));

        boolean check = employeeService.deleteEmployee(id);

        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createEmployee(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException, ParseException {
        int ma_nhan_vien = Integer.parseInt(request.getParameter("ma_nhan_vien"));
        String ho_ten = request.getParameter("ho_ten");
        String ngay_sinh = request.getParameter("ngay_sinh");
        String so_cmnd = request.getParameter("so_cmnd");
        double luong = Double.parseDouble(request.getParameter("luong"));
        String so_dien_thoai = request.getParameter("so_dien_thoai");
        String email = request.getParameter("email");
        String dia_chi = request.getParameter("dia_chi");
        Employee newEmployee = new Employee(ma_nhan_vien, ho_ten, ngay_sinh, so_cmnd, luong, so_dien_thoai, email, dia_chi);
        List<String> messList =employeeService.createEmployee(newEmployee);

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
        request.setAttribute("employeeList", employeeService.listEmployee());

        RequestDispatcher dispatcher = request.getRequestDispatcher("furama/Employee/create.jsp");
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
                showEditForm(request, response);
                break;
            case "delete":
                break;
            case "search":
                break;
            default:
                showEmployee(request, response);
                // hien thi danh sách
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int ma_nhan_vien = Integer.parseInt(request.getParameter("ma_nhan_vien"));
        Employee employee = employeeService.getEmployeeById(ma_nhan_vien);

        RequestDispatcher dispatcher = request.getRequestDispatcher("furama/Employee/edit.jsp");
        request.setAttribute("employee", employee);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("furama/Employee/create.jsp");

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEmployee(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("furama/Employee/list.jsp");
        request.setAttribute("employeeList", employeeService.listEmployee());

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
