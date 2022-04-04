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
    <a href="list.jsp">Back to List Employee</a>

    <form action="/employee?action=add" method="post">
        <table>
            <tr>
                <td>ID:</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>Birthday:</td>
                <td><input type="date" name="birthday"></td>
            </tr>
            <tr>
                <td>Salary:</td>
                <td><input type="text" name="salary"></td>
            </tr>
            <tr>
                <td>Phone:</td>
                <td><input type="text" name="phone"></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="text" name="email"></td>
            </tr>
        </table>
    </form>

</body>
</html>
