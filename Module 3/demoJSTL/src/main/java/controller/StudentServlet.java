package controller;

import model.bean.Student;
import model.service.ClassService;
import model.service.StudentService;
import model.service.impl.ClassServiceImpl;
import model.service.impl.StudentServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "controller.StudentServlet", urlPatterns = {"/student"})
public class StudentServlet extends HttpServlet {
    private StudentService studentService = new StudentServiceImpl();
    private ClassService classService = new ClassServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                // Lưu vào database
                save(request, response);
                break;
            case "edit":
                // chỉnh sửa
                break;
            case "delete":
                delete(request, response);
                break;
            case "search":
                search(request, response);
                break;
            default:
                // hien thi danh sách
        }


    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
        String searchName = request.getParameter("searchName");
        String searchEmail= request.getParameter("searchEmail");
        String searchClassId = request.getParameter("searchClassId");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/student/list.jsp");
        request.setAttribute("studentList", studentService.search(searchName,searchEmail,searchClassId));
        request.setAttribute("classList", classService.findAll());
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void save(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String birthday = request.getParameter("birthday");
        int point = Integer.parseInt(request.getParameter("point"));
//        String account =request.getParameter("account");
        int classId = Integer.parseInt(request.getParameter("classId"));
        String email = request.getParameter("email");
        Student student = new Student(name, gender, birthday, point, classId, email);
        List<String> messList = studentService.add(student);

        boolean check =true;
        for (String mess: messList) {
            if (!mess.equals("")){
                check =false;
            }
        }
        String mess = "Them moi thanh cong";
        if (!check) {
            mess = "them moi khong thanh cong";
        }
        request.setAttribute("mess", mess);
        request.setAttribute("messList", messList);
        request.setAttribute("classList", classService.findAll());
        try {
            request.getRequestDispatcher("/view/student/create.jsp").forward(request, response);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                // trả về một form thêm mới
                showFormCreate(request, response);
                break;
            case "edit":
                // chỉnh sửa
                break;
            case "delete":
                break;
            case "search":
                break;
            default:
                showStudentList(request, response);
                // hien thi danh sách
        }


    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        boolean check=studentService.delete(id);
        try {
            response.sendRedirect("/student");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {

        // trả về form thêm mới
        request.setAttribute("classList", classService.findAll());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/student/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showStudentList(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/student/list.jsp");
        request.setAttribute("studentList", studentService.findAll());
        request.setAttribute("classList", classService.findAll());
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
