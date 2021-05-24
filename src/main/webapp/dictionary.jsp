<%--
  Created by IntelliJ IDEA.
  User: YEN
  Date: 5/24/2021
  Time: 8:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Map"  %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Set" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<%!
    Map<String,String> dic = new HashMap<>();

%>

<%
    dic.put("Book", "Sách");
    dic.put("How", "Thế nào");
    dic.put("Dictionary", "Từ Điển");
    dic.put("Teacher", "Giáo Viên");
    dic.put("JSP", "Môi trường công cụ người dùng hiển thị, bôi đên, nhập xuất dữ liệu");
    dic.put("Servlet","Công cụ hỗ trợ server truy vấn dữ liệu, xử lý logic");

    String search = request.getParameter("search");

    String result = dic.get(search);

    if (result !=null){
        out.println("Word"+ search);
        out.println("Result"+ result);

    }else
        out.println("Not Found");

%>


</body>
</html>
