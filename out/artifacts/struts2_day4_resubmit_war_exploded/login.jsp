<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Reborn。
  Date: 2017/6/4
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login</title>
  </head>
  <body>
  <s:form action="loginAction1">
    <s:token></s:token>
    <s:textfield label="用户名" name="name"/>
    <s:submit value="登录"></s:submit>
  </s:form>
  </body>
</html>
