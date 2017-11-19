
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>--%>
<html>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script type="text/javascript">
$(function () {
    $("#btn").click(function () {
         $.post('${pageContext.request.contextPath}/doFirst',{},function (data) {
         alert(data);
         });
    })
})

</script>
<body>
<h2>Hello Index!</h2>
<input type="button" id="btn" value="Ajax"/>
</body>
</html>
