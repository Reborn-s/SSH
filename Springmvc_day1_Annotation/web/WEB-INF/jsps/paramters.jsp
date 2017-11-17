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
  <hr size="12" color="blue"/>
  <form action="${pageContext.request.contextPath}/user/receiveInt.do">
    ID:<input type="text" name="id" id="id">
    <input type="submit" value="提交"/>
  </form>

  <hr size="12" color="blue"/>
  <form action="${pageContext.request.contextPath}/user/receiveStr.do">
    String:<input type="text" name="username" id="username">
    <input type="submit" value="提交"/>
  </form>

    <hr size="12" color="blue"/>
    <form action="${pageContext.request.contextPath}/user/receiveArray.do">
      ID:<input type="checkbox" name="ids"  value="1">
      ID:<input type="checkbox" name="ids"  value="2">
      ID:<input type="checkbox" name="ids"  value="2">
      ID: <input type="submit" value="提交"/>
    </form>

  <hr size="12" color="blue"/>
  <form action="${pageContext.request.contextPath}/user/receiveUser.do">
    用户名:<input type="text" name="username"  id="username1"><br/>
    生日:<input type="text" name="birthday"  id="birthday"><br/>
    性别:<input type="text" name="sex"  id="sex"><br/>
    地址:<input type="text" name="address"  id="address"><br/>
    <input type="submit" value="提交"/>
  </form>

  <hr size="12" color="blue"/>
  <form action="${pageContext.request.contextPath}/user/receiveUserCustom.do">
    用户名:<input type="text" name="user.username"  id="usernamec"><br/>
    生日:<input type="text" name="user.birthday"  id="birthdayc"><br/>
    性别:<input type="text" name="user.sex"  id="sexc"><br/>
    地址:<input type="text" name="user.address"  id="addressc"><br/>
    <input type="submit" value="提交"/>
  </form>

  <hr size="12" color="blue"/>
  <form action="${pageContext.request.contextPath}/user/receiveList.do">
    用户名:<input type="text" name="userList[0].username" ><br/>
    地址:<input type="text" name="userList[0].address" ><br/>

    用户名:<input type="text" name="userList[1].username" ><br/>
    地址:<input type="text" name="userList[1].address" ><br/>
    <input type="submit" value="提交"/>
  </form>

  <form action="${pageContext.request.contextPath}/user/receiveMap.do">
    用户名:<input type="text" name="map['username']" ><br/>
    地址:<input type="text" name="map['address']" ><br/>

    <input type="submit" value="提交"/>
  </form>

  </body>
</html>
