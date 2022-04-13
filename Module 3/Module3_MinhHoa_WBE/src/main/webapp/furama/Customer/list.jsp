<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 4/13/2022
  Time: 7:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer</title>

    <script src="../../CDN-Bootstrap/bootstrap-4.6.1-dist/jquery-3.0.0.min.js"></script>
    <link rel="stylesheet" href="../../CDN-Bootstrap/bootstrap-4.6.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../datatables/css/dataTables.bootstrap4.min.css">
    <script src="../../CDN-Bootstrap/bootstrap-4.6.1-dist/js/bootstrap.min.js"></script>
    <script src="../../datatables/js/jquery.dataTables.min.js"></script>
    <script src="../../datatables/js/dataTables.bootstrap4.min.js"></script>

    <style>
        .btn-danger:hover{
            background-color: rgba(255,162,98,0.85);
            border: 1px solid rgba(255,162,98,0.85);
        }
    </style>
</head>
<body>
<div class="container-fluid">
    <h1>List Customer</h1>
    <a href="../../index.jsp" style="margin-top: 10px;">Back To Home Page</a><br>

    <a href="/customer?action=create" class="btn btn-success" role="button" style="margin: 10px 0">Create New Customer</a>

    <%--    Tìm Kiếm    --%>
    <form action="/customer?action=search" method="post">
        <input name="search_ho_ten" placeholder="Search Theo Tên">
        <input name="search_email" placeholder="Search Theo Email">
        <button> Search</button>
    </form>
    <%--    End Tìm Kiếm    --%>

    <table id="tableCustomer" class="table table-striped table-bordered" style="border-collapse: collapse">
        <thead>
        <tr>
            <th>STT</th>
            <th>Ma Khách Hàng</th>
            <th>Họ và Tên</th>
            <th>Ngày Sinh</th>
            <th>Số CMND</th>
            <th>SĐT</th>
            <th>Email</th>
            <th>Địa Chỉ</th>
            <th>Xóa</th>
            <th>Sửa</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${customerList}" var="customer" varStatus="item">
            <tr>
                <td>${item.count}</td>
                <td>${customer.ma_khach_hang}</td>
                <td>${customer.ho_ten}</td>
                <td>${customer.ngay_sinh}</td>
                <td>${customer.so_cmnd}</td>
                <td>${customer.so_dien_thoai}</td>
                <td>${customer.email}</td>
                <td>${customer.dia_chi}</td>
                <td>
                    <button type="button" onclick="infoDelete('${customer.ma_khach_hang}', '${customer.ho_ten}')" class="btn btn-danger" data-toggle="modal" data-target="#exampleModal">
                        Delete
                    </button>
                </td>
                <td>
                    <a href="/customer?action=edit&ma_khach_hang=${customer.ma_khach_hang}" class="btn btn-outline-primary" role="button">Edit</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
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
            <form action="/customer?action=delete" method="post">
                <div class="modal-body">
                    <span>Bạn có muốn xóa khách hàng tên: </span><span id="customerName" style="color: blue"></span>
                    <input type="text" id="customerID" name="ma_khach_hang" hidden>
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
        document.getElementById("customerName").innerText=name;
        document.getElementById("customerID").value=id;
    }


    //Phân Trang
    $(document).ready(function() {
        $('#tableCustomer').dataTable( {
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        } );
    } );
</script>
</body>
</html>
