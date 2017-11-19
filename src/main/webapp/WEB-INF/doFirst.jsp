<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>doFirst</title>
</head>
<body>
<h1>doFirst</h1>
<img src="<%=path%>/img/5.jpg"/>
</body>
</html>
