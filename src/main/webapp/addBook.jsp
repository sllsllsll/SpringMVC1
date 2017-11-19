<%--
  Created by IntelliJ IDEA.
  User: linlin
  Date: 2017/8/21
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>添加图书</title>
</head>
<body>
<h1>添加图书</h1>
<form action="<%=path%>/addBook" method="post">
   <input type="submit"/>
</form>
</body>
</html>
