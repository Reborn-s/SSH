<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Reborn。
  Date: 2017/6/2
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>参加装载</title>
  </head>
  <body>
  <form action="<c:url value="action3.action"/>" method="post">
    用户名：<input type="text" name="user.username"/>
    密  码：<input type="password" name="user.password"/>
    <input type="submit" value="提交"/>
  </form>
  </body>
</html>
