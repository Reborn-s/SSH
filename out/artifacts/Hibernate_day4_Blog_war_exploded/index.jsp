<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
  <title>主题列表</title>
  <link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>

<!-- 简单搜索表单 -->
<div style="margin: 15px auto; " >
  <!-- 搜索表单 -->
  <s:form action="TopicAction_list.action" theme="simple" namespace="/">
    <font class="logoLabel">传智播客贴吧</font>
    <s:textfield name="key" cssClass="queryString"/>
    <input type="submit" value="搜 索" />
  </s:form>
</div>

<!-- 菜单 -->
<div class="menubar"></div>

<!-- 主题列表 -->
<table cellspacing="0">
  <tbody class="list topicList">
  <!--显示表头-->
  <tr class="title">
    <td width="25">编号</td>
    <td width="25">回复</td>
    <td width="500">标题</td>
    <td width="110">作者</td>
    <td width="145">最后回复时间</td>
  </tr>

  <!-- 显示部门列表 -->
  <s:iterator value="#list" var="topic">

  <tr class="data">
    <td class="num"><s:property value="tid"/></td>
    <td class="num"><s:property value="replySet.size"/></td>
    <td><a href="ReplyAction_list.action" name="topic"><s:property value="title"/></a></td>
    <td class="info"><s:property value="ipAddr"/></td>
    <td class="info"><s:date name="lastReplyDate" format="YYYY-MM-DD hh:mm:ss"/></td>
  </tr>

  </s:iterator>

  <tr>
    <td colspan="5" class="num">共有主题数<font color="red"><s:property value="#list.size"/> </font>个</td>
  </tr>
  </tbody>
</table>

<div style="margin-bottom: 15px"></div>

<!--发表主题表单-->
<s:form action="TopicAction_add.action" namespace="/" theme="simple">
  <table class="publishArticleForm">
    <tr>
      <td>标　题:</td>
      <td>
        <s:textfield name="topic.title" cssClass="title"/>
      </td>
    </tr>
    <tr>
      <td>内　容:</td>
      <td>
        <s:textarea name="topic.topicContent" cssClass="content"/>
      </td>
    </tr>
    <tr>
      <td></td>
      <td><input type="submit" value="发　表" /></td>
    </tr>
  </table>
</s:form>

</body>
</html>
