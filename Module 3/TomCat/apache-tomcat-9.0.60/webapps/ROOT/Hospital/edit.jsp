<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 4/15/2022
  Time: 7:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Benh An</title>

    <script src="../CDN-Bootstrap/bootstrap-4.6.1-dist/jquery-3.0.0.min.js"></script>
    <link rel="stylesheet" href="../CDN-Bootstrap/bootstrap-4.6.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.min.css">
    <script src="../CDN-Bootstrap/bootstrap-4.6.1-dist/js/bootstrap.min.js"></script>
    <script src="../datatables/js/jquery.dataTables.min.js"></script>
    <script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
</head>
<body>
    <h1>EDIT Bệnh Án</h1>
    <a href="/benhan" class="btn btn-success" role="button">Back To List Benh An</a>

    <form action="/benhan?action=edit" method="post">
        <table>
            <tr>
                <td>Tên Bệnh Nhân:</td>
                <td><input type="text" name="ten_benh_nhan" value="<c:out value="${benhan.ten_benh_nhan}"></c:out>"></td>
            </tr>
            <tr>
                <td>Ngày Nhập viện:</td>
                <td><input type="date" name="ngay_nhap_vien" value="<c:out value="${benhan.ngay_nhap_vien}"></c:out>"></td>
            </tr>
            <tr>
                <td>Ngày Ra Viện:</td>
                <td><input type="date" name="ngay_ra_vien" value="<c:out value="${benhan.ngay_ra_vien}"></c:out>"></td>
            </tr>
            <tr>
                <td>Lý Do nhập viên:</td>
                <td><input type="text" name="ly_do_nhap_vien" value="<c:out value="${benhan.ly_do_nhap_vien}"></c:out>"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Sửa"></td>
            </tr>
        </table>
    </form>
</body>
</html>
