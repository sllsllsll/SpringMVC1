<%--
  Created by IntelliJ IDEA.
  User: linlin
  Date: 2017/8/28
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>类型转换</h1>
<form action="${pageContext.request.contextPath }/first" method="post">
    出生日期:<input name="birthday" value="${date}"/><br/><br/>
    年龄:<input name="age" value="${age}"/><br/><br/>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
