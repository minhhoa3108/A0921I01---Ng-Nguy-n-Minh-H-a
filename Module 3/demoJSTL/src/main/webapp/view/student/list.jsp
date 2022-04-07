<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 3/21/2022
  Time: 6:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="jquery/jquery-3.6.0.min.js"></script>
    <link rel="stylesheet" href="bootstrap4.6.0/css/bootstrap.css">
    <script src="bootstrap4.6.0/js/bootstrap.min.js"></script>
</head>
<body>
<h1>Trang danh sách sinh viên</h1>
<form action="/student?action=search" method="post">
    <input name="searchName">
    <input name="searchEmail">
    <select name="searchClassId">
        <option value="" >Chọn lớp</option>
        <c:forEach items="${classList}" var="c1">
            <option value="${c1.id}">${c1.className}</option>
        </c:forEach>
    </select>
    <button> Search</button>
</form>
<a href="/student?action=add">Them moi</a>
<table class="table table-striped" border="1" style="border-collapse:  collapse">
    <tr>
        <th>STT</th>
        <th>Id</th>
        <th>Name</th>
        <th>Gender</th>
        <th>Birthday</th>
        <th>Point</th>
        <th>Xếp loại</th>
        <th>Account</th>
        <th>class Name</th>
        <th>Email</th>
        <th>Delete</th>
    </tr>
    <c:forEach items="${studentList}" var="student" varStatus="item">
    <tr>
        <td>${item.count}</td>
        <td>${student.id}</td>
        <td>${student.name}</td>

        <c:if test="${student.gender}">
            <td>Nam</td>
        </c:if>
        <c:if test="${!student.gender}">
            <td>Nữ</td>
        </c:if>

        <td>${student.birthday}</td>
        <td>${student.point}</td>
        <c:choose>
            <c:when test="${student.point>=8}">
                <td>Giỏi</td>
            </c:when>
            <c:when test="${student.point>=7}">
                <td>Khá</td>
            </c:when>
            <c:when test="${student.point>=5}">
                <td>TrungBinh</td>
            </c:when>
            <c:otherwise>
                <td>Yếu</td>
            </c:otherwise>
        </c:choose>
        <td>${student.account}</td>

<%--        Hiện thị theo classid--%>
<%--        <td>${student.classId}</td>--%>

<%--    Dùng để hiện thị tên lớp theo id-lớp --%>
        <c:forEach items="${classList}" var="c1">
            <c:if test="${c1.id==student.classId}">
                <td>${c1.className}</td>
            </c:if>
        </c:forEach>

<%--        <td>${student.email}</td>--%>
        <td><c:out value="${student.email}"></c:out></td>
        <td>
            <button type="button" onclick="infoDelete('${student.id}','${student.name}')" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                Xóa
            </button>
        </td>
    </tr>
    </c:forEach>
</table>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <form action="/student?action=delete" method="post">
                <div class="modal-body">
                    <span>Bạn có muốn xóa sinh viên tên </span><span id="studentName"></span>
                    <input type="text" id="studentId" name="id" hidden>
                </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Hủy</button>
                <button type="submit" class="btn btn-primary">Xóa</button>
            </div>
            </form>
        </div>
    </div>
</div>
<script>
    function infoDelete(id,name) {
        document.getElementById("studentName").innerText=name;
        document.getElementById("studentId").value=id;
    }
</script>
</body>
</html>
