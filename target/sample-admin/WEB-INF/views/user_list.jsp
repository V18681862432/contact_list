<%@ page import="java.util.List" %>
<%@ page import="com.xust.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: Xiaoluo
  Date: 2020-01-04
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>通讯录管理系统</title>
</head>
<body>
<h1><center><font size="50" color="blue">通讯录</font></center></h1>
    <%
        List<User> list = (List<User>)request.getAttribute("user");
    %>
<table width="700" height="100" border="1" align="center">
    <tr><th>ID</th><th>姓名</th><th>地址</th><th>电话号码</th><th>邮政编码</th><th>邮箱</th><th>其</th><th>它</th></tr>
    <%
        for (int i = 0; i < list.size(); i++) {

    %>
    <tr><td><%=i+1%></td><td><%=list.get(i).getName()%></td><td><%=list.get(i).getAddress()%></td><td><%=list.get(i).getNumber()%></td><td><%=list.get(i).getPostid()%></td><td><%=list.get(i).getEmail()%></td><td><a href="/contact_war_exploded/user/edit/<%=list.get(i).getName()%>">修改</a></td><td><a href="/contact_war_exploded/user/delete/<%=list.get(i).getName()%>">删除</a></td></tr>
    <%
        }
    %>
</table>

<center><button class="button"><a href="/contact_war_exploded/user/to_insert">增加一条数据</a></button></center>
<center>
<form action="/contact_war_exploded/user/group" method="post">
    <select name="type" >
        <option value="name">姓名</option>
        <option value="address">地址</option>
        <option value="number">电话</option>
        <option value="postid">邮编</option>
        <option value="email">邮箱</option>
    </select>
    <input type="submit" value="submit"/>
</form>
</center>
</body>
<style>
    .button {
        background-color: #4e80af; /* Green */
        border: none;
        color: white;
        padding: 16px 32px;
        text-align: center;
        text-decoration: none;
        display: inline-block;
        font-size: 16px;
        margin: 20px 2px;
        -webkit-transition-duration: 0.4s; /* Safari */
        transition-duration: 0.4s;
        cursor: pointer;
    }
</style>
</html>