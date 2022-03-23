<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 3/18/2022
  Time: 9:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discout Calculator</title>
  </head>
  <body>
  <form action="/display-discout" method="get">
    <div class="discout">
      <p style="font-weight: bold; font-size: 20px">Product Discout Calculator</p>
      <p>Product Desciption:</p>
      <input type="text" name="description">
      <p>List Price:</p>
      <input type="text" name="list_price">
      <p>Dicount Percent:</p>
      <input type="text" name="discount_percent"><br>
      <input type="submit" value="Calculator">
    </div>
  </form>
  </body>
</html>
