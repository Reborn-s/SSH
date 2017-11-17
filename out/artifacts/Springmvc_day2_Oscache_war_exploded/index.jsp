<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Reborn。
  Date: 2017/10/20
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="oscache" uri="http://www.opensymphony.com/oscache" %>
<html>
  <head>
    <title>Oscache页面缓存</title>
  </head>
  <body>
  现在时间：<%=new Date()%>
  <hr/>
  <!--缓存默认存储在application中，scope属性可以改变其存范围，key可以固定缓存的key-->
  <oscache:cache scope="session">缓存时间：<%=new Date()%></oscache:cache>
  <hr/>
  <oscache:cache key="reborn">固定key值的缓存时间：<%=new Date()%></oscache:cache>
  <hr/>
  <!--每隔4秒同步一次缓存-->
  <oscache:cache time="4">缓存时间：<%=new Date()%></oscache:cache>

  <!--缓存持久化到本地硬盘需要在src下配置oscache.properties文件-->
  </body>
</html>
