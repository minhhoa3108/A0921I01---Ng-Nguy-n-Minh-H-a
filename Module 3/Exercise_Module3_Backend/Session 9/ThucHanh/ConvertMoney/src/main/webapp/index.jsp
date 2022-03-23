<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 3/18/2022
  Time: 8:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Convert USD to VND</title>
    <style>
      .convert p{
        padding: 5px;
        margin: 5px;
      }
      .convert input{
        padding: 5px;
        margin: 5px;
      }
    </style>
  </head>
  <body>
  <form action="/convert" method="post">
    <div class="convert">
      <h2>Convert USD to VND</h2>
      <p>Rate:</p>
      <input type="text" name="rate">
      <p>USD:</p>
      <input type="text" name="usd"><br>
      <input type="submit" value="Convert">
    </div>
  </form>
  </body>
</html>
