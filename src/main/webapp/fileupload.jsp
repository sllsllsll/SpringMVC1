<%--
  Created by IntelliJ IDEA.
  User: linlin
  Date: 2017/8/30
  Time: 17:14
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
    <title>文件上传</title>
</head>
<body>
<form method="post" action="<%=path%>/first" enctype="multipart/form-data">
    <input type="file" name="upload" />
    <input type="file" name="upload" />
    <input type="file" name="upload" />
    <input type="submit" value="提交"/>
</form>
</body>
</html>
