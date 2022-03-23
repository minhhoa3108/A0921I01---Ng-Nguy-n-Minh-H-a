<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 3/21/2022
  Time: 8:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>STT</th>
            <th>ID</th>
            <th>Name</th>
            <th>Birthday</th>
            <th>Address</th>
            <th>Gender</th>
        </tr>
        <c:forEach items="${customerList}" var="customer" varStatus="item">
        <tr>
            <td>${item.count}</td>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.birthday}</td>
            <td>${customer.address}</td>
            <td>${customer.gender}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
