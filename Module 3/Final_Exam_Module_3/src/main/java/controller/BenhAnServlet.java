package controller;

import model.Service.BenhAn;
import model.Service.BenhAnService;
import model.Service.Impl.BenhAnServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BenhAnServlet", urlPatterns = "/benhan")
public class BenhAnServlet extends HttpServlet {
    BenhAnService benhAnService = new BenhAnServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                editBenhAn(request, response);
                break;
            case "delete":
                deleteBenhAn(request, response);
                break;
        }
    }

    private void editBenhAn(HttpServletRequest request, HttpServletResponse response) {
        int ma_benh_an = Integer.parseInt(request.getParameter("ma_benh_an"));
        String ma_benh_nhan = request.getParameter("ma_benh_nhan");
        String ten_benh_nhan = request.getParameter("ten_benh_nhan");
        String ngay_nhap_vien = request.getParameter("ngay_nhap_vien");
        String ngay_ra_vien = request.getParameter("ngay_ra_vien");
        String ly_do_nhap_vien = request.getParameter("ly_do_nhap_vien");

        BenhAn benhAn = new BenhAn(ma_benh_an, ma_benh_nhan, ten_benh_nhan, ngay_nhap_vien, ngay_ra_vien, ly_do_nhap_vien);;
        benhAnService.editBenhAn(benhAn);
        request.setAttribute("benhanList");
    }

    private void deleteBenhAn(HttpServletRequest request, HttpServletResponse response) {
        int ma_benh_an = Integer.parseInt(request.getParameter("ma_benh_an"));

        boolean check = benhAnService.deleteBenhAn(ma_benh_an);

        try {
            response.sendRedirect("/benhan");
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
            case "edit":
                showEditForm(request, response);
                break;
            default:
                showBenhAn(request, response);
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int ma_benh_an = Integer.parseInt(request.getParameter("ma_benh_an"));
        BenhAn benhAn = benhAnService.getBenhAnById(ma_benh_an);

        RequestDispatcher dispatcher = request.getRequestDispatcher("Hospital/edit.jsp");
        request.setAttribute("benhan", benhAn);

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showBenhAn(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("Hospital/list.jsp");
        request.setAttribute("benhanList", benhAnService.listAll());

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
