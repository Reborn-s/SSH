<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Reborn。
  Date: 2017/6/4
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>UI小案例</title>
  </head>
  <body>

  <s:form action="UIAction">
    <s:textfield label="用户名" name="name"/>
    <s:password label="密码" name="password"/>
    <s:checkbox label="婚否" value="true" name="married"/>
    <s:checkboxlist list="{'任家萱','田馥甄','陈嘉桦'}" label="爱好" name="hobby"></s:checkboxlist>
    <s:select list="#{'BJ':'北京','SH':'上海','TP':'台北'}" headerKey="" headerValue="---请选择---" label="城市" name="city"></s:select>
    <s:textarea label="个人介绍" name="description" rows="5" cols="25"/>
    <s:radio list="#{'male':'男','female':'女'}" value="'female'" name="gender"/>
    <s:submit value="注册"></s:submit>
    <s:reset value="重置"></s:reset>
  </s:form>

  <s:debug/>
  </body>
</html>
