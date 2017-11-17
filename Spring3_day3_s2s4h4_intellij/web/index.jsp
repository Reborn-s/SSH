<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Reborn。
  Date: 2017/6/17
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Register</title>
  </head>
  <body>
  <s:form action="userAction_register" method="POST">
    <s:textfield name="username" label="用户名："/><br/>
    <s:textfield name="password" label="密 码："/><br/>
    <s:textfield name="age" label="年 龄："/><br/>
    <s:submit label="提交"/>
  </s:form>
  </body>
</html>
