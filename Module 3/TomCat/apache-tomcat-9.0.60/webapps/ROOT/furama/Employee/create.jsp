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

    <style>
        .error{
            color: red;
        }
        #mess{
            color: green;
        }
    </style>
</head>
<body>
    <h2>Create new Employee</h2>
    <a href="/employee?action=''" class="btn btn-success" role="button" style="margin: 10px 0">Back to List Employee</a>
    <c:if test="${mess!=null}">
        <p id="mess">${mess}</p>
    </c:if>


    <form action="/employee?action=create" method="post">
        <table cellpadding="5">
            <tr>
                <td>Mã Nhân Viên:</td>
                <td><input type="text" name="ma_nhan_vien"></td>
            </tr>
            <tr>
                <td>Họ và Tên:</td>
                <td><input type="text" name="ho_ten"><span class="error" style="padding-left: 5px">${messList[0]}</span></td>

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
                <td><input type="text" name="so_dien_thoai"><span class="error" style="padding-left: 5px">${messList[2]}</span></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="text" name="email"><span class="error" style="padding-left: 5px">${messList[1]}</span></td>
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
