<%--
  Created by IntelliJ IDEA.
  User: Liang
  Date: 2019/9/20
  Time: 12:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登陆页面</title>
  </head>
  <body>
  <h3>y：${pageContext.request.getAttribute("username")}</h3>
      <a href="User.html" target="_blank">点击此处返回登录页面</a>
  </body>
</html>
