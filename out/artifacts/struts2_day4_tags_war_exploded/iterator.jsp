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
    <title>Iterator标签的使用</title>
  </head>
  <body>
  <table border="1" align="center" width="500px">
    <tr>
      <td>学号</td>
      <td>姓名</td>
      <td>年龄</td>
    </tr>
    <s:iterator value="students" var="student" status="vs">
      <tr>
        <td><s:property value="#vs.count"/> </td>
        <td><s:property value="#student.name"/> </td>
        <td><s:property value="#student.age"/> </td>
      </tr>
    </s:iterator>
  </table>

  <hr/>

  <table border="1" align="center" width="500px">
    <tr>
      <td>学号</td>
      <td>姓名</td>
      <td>年龄</td>
    </tr>
    <s:iterator value="students" status="vs">
      <tr>
        <td><s:property value="#vs.index"/> </td>
        <td><s:property value="name"/> </td>
        <td><s:property value="age"/> </td>
      </tr>
    </s:iterator>
  </table>

  <s:debug/>
  </body>
</html>
