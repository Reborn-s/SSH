<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="a" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Reborn。
  Date: 2017/6/4
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>ActionContext</title>
  </head>
  <body>
  <s:debug/>
  <hr/>

  <s:property value="#actionContextMap"/><br/>
  <s:property value="#session.user"/><br/>
  <s:property value="#session.name"/><br/>
  <s:property value="#application.student"/><br/>
  </body>
</html>
