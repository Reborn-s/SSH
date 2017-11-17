<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Reborn。
  Date: 2017/6/3
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login</title>
  </head>
  <body>
  <s:form action="login/login">
    <s:textfield name="username" label="用户名"/>
    <s:textfield name="password" label="密 码"/>
    <s:submit label="登录"/>
  </s:form>
  </body>
</html>
