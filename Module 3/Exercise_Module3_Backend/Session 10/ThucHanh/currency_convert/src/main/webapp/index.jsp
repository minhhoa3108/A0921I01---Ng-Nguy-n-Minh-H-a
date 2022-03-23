<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 3/21/2022
  Time: 7:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency Converter</title>
  </head>
  <body>
  <h2>Currency Converter</h2>
  <form action="converter.jsp" method="get">
    <label>Rate:</label><br>
    <input type="text" name="rate"><br>

    <label>USD: </label><br>
    <input type="text" name="usd"><br>

    <input type="submit">
  </form>
  </body>
</html>
