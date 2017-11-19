<%--
  Created by IntelliJ IDEA.
  User: linlin
  Date: 2017/8/30
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>数据校验</h1>
<form action="/first" method="post">
    成绩:<input name="score" /> <span>${scoremsg }</span><br/><br/>
    姓名:<input name="name"/><span>${namemsg }</span><br/><br/>
    电话:<input name="phone"/><span>${phonemsg }</span><br/><br/>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
