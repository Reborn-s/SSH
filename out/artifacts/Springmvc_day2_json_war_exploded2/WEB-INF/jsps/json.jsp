<%--
  Created by IntelliJ IDEA.
  User: Reborn。
  Date: 2017/10/15
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script>
      function requestJson() {
        var jsonObj = JSON.stringify({"username":"喜碧","sex":"female","address":"台北"});
        $.ajax({
          type:'POST',
          url:'${pageContext.request.contextPath}/json/requestJson.do',
          contentType:'application/json;charset=utf-8',
          data:jsonObj,
          success:function (data) {
            alert(data.username);
          }
        })
      }

      function requestPojo()
      {
        $.ajax(
                {
                  type:'POST',
                  url:'${pageContext.request.contextPath}/json/requestPojo.do',
                  data:'username=喜碧&address=台北',
                  success:function (data) {
                    alert(data.username);
                  }

                }
        )
      }
    </script>
    <title>Springmvc支持json格式数据</title>
  </head>
  <body>
  <input type="button" value="请求json，返回json" onclick="requestJson();">
  <br/>
  <input type="button" value="请求pojo，返回json" onclick="requestPojo();">
  </body>
</html>
