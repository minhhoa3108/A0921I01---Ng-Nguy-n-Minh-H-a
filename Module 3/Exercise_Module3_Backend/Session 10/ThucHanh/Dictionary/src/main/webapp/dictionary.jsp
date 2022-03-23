<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 3/21/2022
  Time: 7:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <%!
        Map<String, String> dictionary = new HashMap<>();
    %>

    <%
        dictionary.put("hello", "xin chào");
        dictionary.put("how", "thế nào");
        dictionary.put("age", "tuổi");
        dictionary.put("name", "tên");
        dictionary.put("address", "địa chỉ");

        String search = request.getParameter("search");
        String result = dictionary.get(search);

        if(result!=null){
            out.println("word:" + search);
            out.println("result:" + result);
        }else{
            out.println("Not found");
        }
    %>
</body>
</html>
