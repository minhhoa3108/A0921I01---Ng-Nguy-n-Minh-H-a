<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 4/15/2022
  Time: 6:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hospital</title>

    <script src="../CDN-Bootstrap/bootstrap-4.6.1-dist/jquery-3.0.0.min.js"></script>
    <link rel="stylesheet" href="../CDN-Bootstrap/bootstrap-4.6.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.min.css">
    <script src="../CDN-Bootstrap/bootstrap-4.6.1-dist/js/bootstrap.min.js"></script>
    <script src="../datatables/js/jquery.dataTables.min.js"></script>
    <script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
</head>
<body>

    <h1>Hồ Sơ Bệnh Án</h1>
    <table id="tableBenhAn" class="table table-striped table-bordered" style="border-collapse: collapse">
        <thead>
        <tr>
            <th>STT</th>
            <th>Mã Bệnh Án</th>
            <th>Mã Bệnh Nhân</th>
            <th>Tên Bệnh Nhân</th>
            <th>Ngày Nhập Viện</th>
            <th>Ngày ra viện</th>
            <th>Lý Do Nhập Viện</th>
            <th>Xóa</th>
            <th>Sửa</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${benhanList}" var="benhAn" varStatus="item">
            <tr>
                <td>${item.count}</td>
                <td>${benhAn.ma_benh_an}</td>
                <td>${benhAn.ma_benh_nhan}</td>
                <td>${benhAn.ten_benh_nhan}</td>
                <td>${benhAn.ngay_nhap_vien}</td>
                <td>${benhAn.ngay_ra_vien}</td>
                <td>${benhAn.ly_do_nhap_vien}</td>
                <td>
                    <button type="button" onclick="infoDelete('${benhAn.ma_benh_an}', '${benhAn.ten_benh_nhan}')" class="btn btn-outline-danger" data-toggle="modal" data-target="#exampleModal">
                        Xóa
                    </button>
                </td>
                <td>
                    <a href="/benhan?action=edit&ma_benh_an=${benhAn.ma_benh_an}" class="btn btn-primary" role="button">SỬA</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
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
                <form action="/benhan?action=delete" method="post">
                    <div class="modal-body">
                        <span>Bạn có muốn xóa Bệnh Án của Bệnh Nhân: </span><span id="ten_benh_nhan" style="color: blue"></span>
                        <input type="text" id="ma_benh_an" name="ma_benh_an" hidden>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                        <button type="submit" class="btn btn-primary">Xóa</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <script>
        function infoDelete(id,name) {
            document.getElementById("ten_benh_nhan").innerText=name;
            document.getElementById("ma_benh_an").value=id;
        }

        $(document).ready(function() {
            $('#tableBenhAn').dataTable( {
                "dom": 'lrtip',
                "lengthChange": false,
                "pageLength": 3
            } );
        } );
    </script>
</body>
</html>
