
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
        $.ajax({
            url:"${pageContext.request.contextPath}/domap",
            success:function(data){ //data指的是从server打印到浏览器的数据
              /*  alert(data.name+data.age);*/
              $.each(data,function (i,dom) {
                  alert(dom.name+"\t"+dom.age);
              });
            }
        });

    })
})

</script>
<body>
<h2>Object!</h2>
<input type="button" id="btn" value="Object"/>
</body>
</html>
