<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<%--
  Created by IntelliJ IDEA.
  User: Reborn。
  Date: 2017/6/2
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Regist</title>
    <s:head></s:head>
  </head>
  <body>

  <s:actionerror />
  <s:fielderror /><!--想要显示出这个fieldError那么reslut回这个页面的动作必须是转发，不能是redirect-->
  <s:form action="registAction">
    <s:textfield name="username" label="用户名" requiredLabel="true" labelposition="left" errorPosition="left"/>
    <s:password name="password" label="密 码" showPassword="true"/>
    <s:textfield name="birthday" label="生 日"/>
    <s:submit value="注册"/>
  </s:form>

  <%--<form action="<c:url value="registAction.action"/>" method="post">
    用户名:<input type="text" name="username"/><br/>
    密  码:<input type="password" name="password"/><br/>
    生  日:<input type="text" name="birthday"/><br/>
    爱  好:<input type="checkbox" name="hobby" value="吃饭"/>吃饭
          <input type="checkbox" name="hobby" value="睡觉"/>睡觉
          <input type="checkbox" name="hobby" value="打豆豆"/>打豆豆<br/>
    婚  否:<input type="checkbox" name="married" value="true"/><br/>
    <input type="submit" value="注册"/>
  </form>--%>
  </body>
</html>
