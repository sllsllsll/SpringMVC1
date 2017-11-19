<%--
  Created by IntelliJ IDEA.
  User: linlin
  Date: 2017/8/18
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login</h1>
<form method="post" action="<%=path%>/fourth">
   用户名： <input name="uname">
    图书名称：<input name="list[0].bookname"/>
    图书名称：<input name="list[1].bookname"/>
    <input type="submit">

</form>
</body>
</html>
