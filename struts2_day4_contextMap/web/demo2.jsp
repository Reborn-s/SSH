<%@ page import="com.opensymphony.xwork2.util.ValueStack" %>
<%@ page import="com.opensymphony.xwork2.ActionContext" %>
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
    <title>ValueStack</title>
  </head>
  <body>
  <s:debug/>
  <hr/>

  <s:property value="name"/><br/>
  <s:property value="[0].name"/><br/>
  <s:property value="[1].name"/><br/>
  <s:property value="[2].name"/><br/>
  <s:property value="map1.name"/><br>
  <s:property/>

  <hr/>

  <%
    ValueStack valueStack = ActionContext.getContext().getValueStack();
    out.print("<br/>");
    out.print(valueStack.findValue("map1.name"));
  %>
  </body>
</html>
