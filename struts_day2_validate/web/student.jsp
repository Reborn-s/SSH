<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Reborn。
  Date: 2017/6/2
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>添加学生</title>
    <s:head></s:head>
  </head>
  <body>
  <s:actionerror/>

  <s:form action="addStudentAction">
    <s:textfield name="username"  label="用户名" requiredLabel="true"/>
    <s:textfield name="age" label="年  龄"/>
    <s:textfield name="email" label="邮  箱"/>
    <s:textfield name="password" label="密  码"/>
    <s:textfield name="repassword" label="确认密码"/>
    <s:textfield name="score" label="分  数"/>
    <s:textfield name="url" label="个人主页"/>
    <s:radio name="gender" list="{'男','女'}" label="性  别"/>
    <s:submit value="添加"/>
  </s:form>

  </body>
</html>
