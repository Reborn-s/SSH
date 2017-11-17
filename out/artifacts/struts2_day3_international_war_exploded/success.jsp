<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Reborn。
  Date: 2017/6/3
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title><s:text name="title"></s:text></title>
  </head>
  <body>
  <s:text name="key"/><br/>
  <s:text name="test"/><hr/>

  <!--自由指定资源包--!>
  <s:i18n name="com.reborn.resources.message">
    <s:text name="key"/>
  </s:i18n>


  </body>
</html>
