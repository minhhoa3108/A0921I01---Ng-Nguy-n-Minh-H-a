<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 3/18/2022
  Time: 8:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login</title>
<%--    <script src="C:\Codegym\Module 3\Exercise_Module3\CDN-Bootstrap\bootstrap-4.6.1-dist\jquery-3.0.0.min.js"></script>--%>
<%--    <link rel="stylesheet" href="C:\Codegym\Module 3\Exercise_Module3\CDN-Bootstrap\bootstrap-4.6.1-dist\css\bootstrap.min.css">--%>
<%--    <script src="C:\Codegym\Module 3\Exercise_Module3\CDN-Bootstrap\bootstrap-4.6.1-dist\js\bootstrap.min.js"></script>--%>

    <style>
      .login input{
        padding: 5px;
        margin: 5px;
      }
    </style>
  </head>
  <body>
    <form action="/login" method="post">
      <div class="login" style="width: 100px; justify-content: center">
        <h2>Login</h2>
        <input type="text" name="username" placeholder="Enter Username">
        <input type="password" name="password" placeholder="Enter your Password">
        <input type="Submit">
      </div>
    </form>
  </body>
</html>
