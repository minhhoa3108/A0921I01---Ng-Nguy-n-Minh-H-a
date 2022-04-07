<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 3/23/2022
  Time: 6:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Them moi</title>
</head>
<body>
<h1>Trang thêm mới</h1>
<c:if test="${mess!=null}">
    <p>${mess}</p>
</c:if>

<form action="/student?action=add" method="post">
    <table>
        <%--        <tr>--%>
        <%--            <td>ID</td>--%>
        <%--            <td><input type="text" name="id" placeholder="nhâp id"></td>--%>
        <%--        </tr>--%>
        <tr>
            <td>Tên</td>
            <td>
                <input type="text" name="name" placeholder="nhâp tên">
                <span>${messList[0]}</span>
            </td>
        </tr>
        <tr>
            <td>Giới tính</td>
            <td>
                <input type="radio" name="gender" value="true"> nam
                <input type="radio" name="gender" value="false">nữ
            </td>
        </tr>
        <tr>
            <td>NGày sinh</td>
            <td><input type="date" name="birthday"></td>
        </tr>
        <tr>
            <td>Điểm</td>
            <td>
                <input type="text" name="point" placeholder="nhập điểm">
                <span>${messList[1]}</span>
            </td>
        </tr>
        <%--        <tr>--%>
        <%--            <td>Account</td>--%>
        <%--            <td><input type="text" name="account" placeholder="nhập account"></td>--%>
        <%--        </tr>--%>
        <tr>
            <td>Class id</td>
            <td>
                <select name="classId">
                    <c:forEach items="${classList}" var="class1">
                        <option value="${class1.id}">${class1.className}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td>Email</td>
            <td>
                <input type="text" name="email" placeholder="nhập email">
                <span>${messList[2]}</span>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <button type="submit">Lưu</button>
            </td>
        </tr>
    </table>

</form>
</body>
</html>
