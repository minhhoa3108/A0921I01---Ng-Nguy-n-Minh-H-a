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

        <a href="/employee?action=create" class="btn btn-success" role="button" style="margin: 10px 0">Create New Employee</a>

        <form action="/employee?action=search" method="post">
            <input name="search_ho_ten" placeholder="Search Theo Tên">
            <input name="search_email" placeholder="Search Theo Email">
            <button> Search</button>
        </form>

        <table class="table table-striped" border="1" style="border-collapse: collapse">
            <tr>
                <th>STT</th>
                <th>Ma Nhan Vien</th>
                <th>Họ và Tên</th>
                <th>Ngày Sinh</th>
                <th>Số CMND</th>
                <th>Lương</th>
                <th>SĐT</th>
                <th>Email</th>
                <th>Địa Chỉ</th>
                <th>Xóa</th>
                <th>Sửa</th>
            </tr>
           <c:forEach items="${employeeList}" var="employee" varStatus="item">
               <tr>
                   <td>${item.count}</td>
                   <td>${employee.ma_nhan_vien}</td>
                   <td>${employee.ho_ten}</td>
                   <td>${employee.ngay_sinh}</td>
                   <td>${employee.so_cmnd}</td>
                   <td>${employee.luong}</td>
                   <td>${employee.so_dien_thoai}</td>
                   <td>${employee.email}</td>
                   <td>${employee.dia_chi}</td>
                   <td>
                       <button type="button" onclick="infoDelete('${employee.ma_nhan_vien}', '${employee.ho_ten}')" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                           Delete
                       </button>
                   </td>
                   <td>
                       <a href="/employee?action=edit&ma_nhan_vien=${employee.ma_nhan_vien}" class="btn btn-success" role="button">Edit</a>
                   </td>
               </tr>
           </c:forEach>
        </table>
    </div>




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
                <form action="/employee?action=delete" method="post">
                    <div class="modal-body">
                        <span>Bạn có muốn xóa nhân viên tên: </span><span id="employeeName" style="color: blue"></span>
                        <input type="text" id="employeeID" name="id" hidden>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                        <button type="submit" class="btn btn-primary">Delete</button>
                    </div>
                </form>
            </div>
        </div>
    </div>


    <script>
        function infoDelete(id,name) {
            document.getElementById("employeeName").innerText=name;
            document.getElementById("employeeID").value=id;
        }
    </script>
</body>
</html>
