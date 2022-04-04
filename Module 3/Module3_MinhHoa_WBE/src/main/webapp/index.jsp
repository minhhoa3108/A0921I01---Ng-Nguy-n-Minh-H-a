<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 4/1/2022
  Time: 7:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Furama Resort</title>

    <script src="CDN-Bootstrap/bootstrap-4.6.1-dist/jquery-3.0.0.min.js"></script>
    <link rel="stylesheet" href="CDN-Bootstrap/bootstrap-4.6.1-dist/css/bootstrap.min.css">
    <script src="CDN-Bootstrap/bootstrap-4.6.1-dist/js/bootstrap.min.js"></script>


    <style>
      .navbar{
        color: rgba(18,114,51,0.85);
      }
      nav .collapse ul li{
        margin: 0 25px;
      }
    </style>
  </head>
  <body>

  <%-- Header --%>
  <div style="margin-top: 5px;">
    <div class="container-fluid">
      <div class="row justify-content-between">
        <div class="col-12 col-sm-6">
          <img src="img/logo.png" alt="" width="140" height="140">
        </div>
        <div class="col-12 col-sm-2">
          One of two columns
        </div>
      </div>
    </div>
  </div>

  <%-- Menu --%>
  <nav class="navbar navbar-expand-lg navbar-light" style="margin-top: 10px;background-color: rgba(0,87,58,0.85);">
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
          <a class="nav-link" href="index.jsp" style="color: white;">Home <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href='/employee?action=""' style="color: white;">Employee</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" style="color: white;" href="#">Customer</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" style="color: white;" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-expanded="false" >
            Service
          </a>
          <div class="dropdown-menu" aria-labelledby="navbarDropdown">
            <a class="dropdown-item" href="#">Villa</a>
            <a class="dropdown-item" href="#">House</a>
            <a class="dropdown-item" href="#">Room</a>
          </div>
        </li>
      </ul>
      <form class="form-inline my-2 my-lg-0">
        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-light my-2 my-sm-0" type="submit">Search</button>
      </form>
    </div>
  </nav>


  <%-- Body --%>



  <%-- Footer --%>
  <div class="footer" style="margin-top: 10px; background-color: rgba(167,204,177,0.85)">
    <div class="container-fluid" style="text-align: center">
      <div class="row">
        <div class="col-12">
          <p>abc</p>
        </div>
      </div>
    </div>
  </div>

  </body>
</html>
