<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 4/3/2022
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create New Employee</title>

    <script src="../../CDN-Bootstrap/bootstrap-4.6.1-dist/jquery-3.0.0.min.js"></script>
    <link rel="stylesheet" href="../../CDN-Bootstrap/bootstrap-4.6.1-dist/css/bootstrap.min.css">
    <script src="../../CDN-Bootstrap/bootstrap-4.6.1-dist/js/bootstrap.min.js"></script>
</head>
<body>
    <h2>Create new Employee</h2>
    <a href="/employee?action=''">Back to List Employee</a>

    <form action="/employee?action=create" method="post">
        <table>
            <tr>
                <td>Mã Nhân Viên:</td>
                <td><input type="text" name="ma_nhan_vien"></td>
            </tr>
            <tr>
                <td>Họ và Tên:</td>
                <td><input type="text" name="ho_ten"></td>
            </tr>
            <tr>
                <td>Ngày Sinh:</td>
                <td><input type="date" name="ngay_sinh"></td>
            </tr>
            <tr>
                <td>Số CMND:</td>
                <td><input type="text" name="so_cmnd"></td>
            </tr>
            <tr>
                <td>Lương:</td>
                <td><input type="text" name="luong"></td>
            </tr>
            <tr>
                <td>SĐT:</td>
                <td><input type="text" name="so_dien_thoai"></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>Địa chỉ:</td>
                <td><input type="text" name="dia_chi"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit"></td>
            </tr>
        </table>
    </form>

</body>
</html>
