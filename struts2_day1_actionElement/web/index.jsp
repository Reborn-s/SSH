<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Reborn。
  Date: 2017/6/1
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
 <a href="<c:url value="action1.action"/>">action继承Action</a><br/>
 <a href="<c:url value="action2.action"/>">action继承ActionSupport</a><br/>
<%-- <a href="<c:url value="addUser.action"/>">添加用户</a><br/>
 <a href="<c:url value="updateUser.action"/>">更新用户</a><br/>
 <a href="<c:url value="deleteUser.action"/>">删除用户</a><br/>
 <a href="<c:url value="findUser.action"/>">查询用户</a><br/>--%>
<%--
 <a href="<c:url value="add_User.action"/>">添加用户</a><br/>
 <a href="<c:url value="update_User.action"/>">更新用户</a><br/>
 <a href="<c:url value="delete_User.action"/>">删除用户</a><br/>
 <a href="<c:url value="find_User.action"/>">查询用户</a><br/>--%>

 <a href="<c:url value="user!addUser.action"/>">添加用户</a><br/>
 <a href="<c:url value="user!updateUser.action"/>">更新用户</a><br/>
 <a href="<c:url value="user!deleteUser.action"/>">删除用户</a><br/>
 <a href="<c:url value="user!findUser.action"/>">查询用户</a><br/>
  </body>
</html>
