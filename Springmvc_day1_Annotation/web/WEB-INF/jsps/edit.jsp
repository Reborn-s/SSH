<%--
  Created by IntelliJ IDEA.
  User: Reborn。
  Date: 2017/8/3
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>我爱S.H.E</h1>


  <form action="${pageContext.request.contextPath}/user/update.do">
    姓名：<input type="text" name="username" value="${user.username}"/><br>
    生日：<input type="text" name="birthday" value="${user.birthday}"><br/>
    性别：<input type="text" name="sex" value="${user.sex}"/><br/>
    地址：<input type="text" name="address" value="${user.address}"/><br/>
    <input type="submit" value="提交"/>
  </form>

  <br/>
  <form action="${pageContext.request.contextPath}/user/update/${user.id}.do">
    姓名：<input type="text" name="username" value="${user.username}"/><br>
    生日：<input type="text" name="birthday" value="${user.birthday}"><br/>
    性别：<input type="text" name="sex" value="${user.sex}"/><br/>
    地址：<input type="text" name="address" value="${user.address}"/><br/>
    <input type="submit" value="提交"/>
  </form>
  </body>
</html>
