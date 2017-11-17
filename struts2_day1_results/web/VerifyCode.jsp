<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Reborn。
  Date: 2017/6/1
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>验证码</title>
</head>
<body>
<form action="" method="post">
    验证码：<input type="text" name="vcode">
    <img src="<c:url value="/n1/VerifyCodeAction.action"/>">
</form>
</body>
</html>
