<%--
  Created by IntelliJ IDEA.
  User: linlin
  Date: 2017/8/21
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>图书列表</title>
</head>
<body>
<h1>图书列表</h1>
${bookname}
</body>
</html>
