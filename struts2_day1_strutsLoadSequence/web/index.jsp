<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Reborn。
  Date: 2017/6/1
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Struts的加载顺序</title>
  </head>
  <body>
  <a href="<c:url value="action1.action"/>">我是.action</a>
  <a href="<c:url value="action1"/>">我是没有.action</a>
  <a href="<c:url value="action1.abc"/>">我是.abc</a>
  <a href="<c:url value="action1.abcd"/>">我是.abcd</a>
  <a href="<c:url value="action1.abced"/>">我是.abced</a>

  </body>
</html>
