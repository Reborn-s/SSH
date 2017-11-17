<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Reborn。
  Date: 2017/6/3
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>文件上传</title>
  </head>
  <body>
  <s:actionerror/>
  <s:form action="multiUploadAction" enctype="multipart/form-data">
    <s:textfield name="username" label="用户名"/>
    <s:file name="photo" label="照片"/>
    <s:file name="photo" label="照片"/>
    <s:file name="photo" label="照片"/>
    <s:submit label="提交"/>
  </s:form>
  </body>
</html>
