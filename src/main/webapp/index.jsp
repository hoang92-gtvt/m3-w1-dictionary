<%--
  Created by IntelliJ IDEA.
  User: YEN
  Date: 5/22/2021
  Time: 8:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary</title>
    <link rel="stylesheet" type ="text/css" href="css/style.css">
  </head>
  <body>
<%--  <h2>Vietnamese Dictionary</h2>--%>
<%--  <form action ="/translate" method ="post">--%>
<%--    <input type="text" name="txtSearch" placeholder="Enter your word: "/>--%>
<%--    <input type = "submit" id = "submit" value = "Search"/>--%>
<%--  </form>--%>


  <h2>Simple Caculator</h2>
  <form action ="/caculator" method ="post">
    <input type="text" name="number1" placeholder="Enter your number 1 "/>
    <input type="text" name="number2" placeholder="Enter your number 2 "/>
    <div>Select operator
    <select name="operator">
      <option value="+">Add</option>
      <option value="-">Subtract</option>
      <option value="*">Mutil</option>
      <option value="/">Division</option>

    </select>
    </div>
    <input type = "submit" id = "submit2" value = "Operator"/>
  </form>
  </body>
</html>
