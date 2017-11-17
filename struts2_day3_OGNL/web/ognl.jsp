<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Reborn。
  Date: 2017/6/3
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <s:property value="OGNL Expression"/><br/>
  <s:property value="'OGNL Expression'"/><br/>
  <s:property value="'OGNL Expression'.length()"/><hr/>

  <s:property value="@java.lang.Integer@MAX_VALUE"/><br/>
  <!--Struts2.3.20不支持OGNL静态方法调用allowStaticMethodAccess--!>
  <s:property value="@java.lang.Math@random()"/><hr/>

  <s:radio name="gender" list="{'男','女'}"></s:radio>
  <s:radio name="gender1" list="#{'1':'男','2':'女'}" ></s:radio>
  </body>
</html>
