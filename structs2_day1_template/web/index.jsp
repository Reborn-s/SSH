<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Reborn。
  Date: 2017/6/1
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>HelloStruts</title>
  </head>
  <body>
  <a href="<c:url value="helloAction"/>">我是无.action</a>
  <a href="<c:url value="helloAction.action"/>">我是有.action</a>
  </body>
</html>
