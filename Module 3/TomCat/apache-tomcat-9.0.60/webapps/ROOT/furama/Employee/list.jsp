<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 4/1/2022
  Time: 11:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee</title>

    <script src="../../CDN-Bootstrap/bootstrap-4.6.1-dist/jquery-3.0.0.min.js"></script>
    <link rel="stylesheet" href="../../CDN-Bootstrap/bootstrap-4.6.1-dist/css/bootstrap.min.css">
    <script src="../../CDN-Bootstrap/bootstrap-4.6.1-dist/js/bootstrap.min.js"></script>
    
    
</head>
<body>
    <div class="container-fluid">
        <h1>List Employee</h1>
        <a href="../../index.jsp" style="margin-top: 10px;">Back To Home Page</a><br>

        <a href="./create.jsp" class="btn btn-success" role="button">Create New Employee</a>

        <table class="table table-striped" border="1" style="border-collapse: collapse">
            <tr>
                <th>STT</th>
                <th>ID</th>
                <th>Name</th>
                <th>Birthday</th>
                <th>Salary</th>
                <th>Phone</th>
                <th>Email</th>
            </tr>
           <c:forEach items="${employeeList}" var="employee" varStatus="item">
               <tr>
                   <td>${item.count}</td>
                   <td>${employee.id}</td>
                   <td>${employee.name}</td>
                   <td>${employee.birthday}</td>
                   <td>${employee.salary}</td>
                   <td>${employee.phone}</td>
                   <td>${employee.email}</td>
               </tr>
           </c:forEach>
        </table>
    </div>
</body>
</html>
