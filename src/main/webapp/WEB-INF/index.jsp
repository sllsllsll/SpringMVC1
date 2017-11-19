<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>哈哈</title>
</head>
<body>
<h1>我是SpringMVC，你成功了！！！</h1>
<img src="<%=path%>/img/5.jpg"/>
<h2>${name}</h2>
</body>
</html>
