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
    <%--想要在jsp中实现国际化，需要将配置文件中的属性名改为jsp.s_locale.title这样，如果只是title，jsp中就用不到国际化--%>
    <!--不经过动作类，就是直接找全局资源--!>
    <title><s:text name="jsp.s_locale.title"/></title>
  </head>
  <body>
  <form action="">
    <s:text name="jsp.s_locale.username"/>:<input type="text" name="username"/><br/>
    <s:text name="jsp.s_locale.password"/>:<input type="password" name="password"/><br/>
    <input type="submit" name="submit" value="<s:text name="jsp.s_locale.submit"/>"/>
  </form>
  </body>
</html>
