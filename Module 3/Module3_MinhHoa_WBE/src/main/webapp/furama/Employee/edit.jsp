<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 4/5/2022
  Time: 6:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Employee</title>

    <script src="../../CDN-Bootstrap/bootstrap-4.6.1-dist/jquery-3.0.0.min.js"></script>
    <link rel="stylesheet" href="../../CDN-Bootstrap/bootstrap-4.6.1-dist/css/bootstrap.min.css">
    <script src="../../CDN-Bootstrap/bootstrap-4.6.1-dist/js/bootstrap.min.js"></script>
</head>
<body>
    <h1>Edit Employee</h1>
    <a href="/employee?action=''">Back to List Employee</a>

    <form method="post">
        <table cellpadding="3" border="1">
            <input type="hidden" name="ma_nhan_vien" value="${employee.ma_nhan_vien}"/>
            <tr>
                <th>Họ và Tên:</th>
                <td><input type="text" name="ho_ten" value="<c:out value='${employee.ho_ten}' />"></td>
            </tr>
            <tr>
                <th>Ngày Sinh:</th>
                <td><input type="text" name="ngay_sinh" value="<c:out value='${employee.ngay_sinh}' />"></td>
            </tr>
            <tr>
                <th>Số CMND:</th>
                <td><input type="text" name="so_cmnd" value="<c:out value='${employee.so_cmnd}' />"></td>
            </tr>
            <tr>
                <th>Lương:</th>
                <td><input type="text" name="luong" value="<c:out value='${employee.luong}' />"></td>
            </tr>
            <tr>
                <th>SĐT:</th>
                <td><input type="text" name="so_dien_thoai" value="<c:out value='${employee.so_dien_thoai}' />"></td>
            </tr>
            <tr>
                <th>Email:</th>
                <td><input type="text" name="email" value="<c:out value='${employee.email}' />"></td>
            </tr>
            <tr>
                <th>Địa Chỉ:</th>
                <td><input type="text" name="dia_chi" value="<c:out value='${employee.dia_chi}' />"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="ADD"/>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
