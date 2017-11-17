<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Reborn。
  Date: 2017/6/1
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="<c:url value="packageAction.action"/>">我是没有命名空间的</a>
  <a href="<c:url value="struts/packageAction.action"/>">我是有命名空间的</a>
  <a href="<c:url value="struts/action2.action"/>">我也是没有命名空间的</a>

  </body>
</html>
