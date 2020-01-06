<%@ page import="com.xust.entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑页面</title>
</head>
<body>
<center>
    <%
        User user =(User) request.getAttribute("user");
    %>
    <h3><%=user.getName()%>，你好，请修改信息</h3>
    <form action="/contact_war_exploded/user/to_add/<%=user.getName()%>" method="post" >
        地址：<input type="text" name="address" value="<%=user.getAddress()%>"/><br/>
        电话：<input type="number" name="number" value="<%=user.getNumber()%>"/><br/>
        编码：<input type="text" name="postid" value="<%=user.getPostid()%>"/><br/>
        邮箱：<input type="email" name="email" value="<%=user.getEmail()%>"/><br/>
        <input type="submit" value="提交">
    </form>
</center>
</body>
</html>
