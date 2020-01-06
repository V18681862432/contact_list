<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加信息</title>
</head>
<body>
<center>
    <form action="/contact_war_exploded/user/insert" method="post" >
        姓名：<input type="text" name="name" placeholder="请输入姓名"><br/>
        地址：<input type="text" name="address" placeholder="请输入地址"/><br/>
        电话：<input type="number" name="number" placeholder="请输入电话"/><br/>
        邮编：<input type="text" name="postid" placeholder="请输入邮编"/><br/>
        邮箱：<input type="email" name="email" placeholder="请输入邮箱"/><br/>
        <input type="submit" value="提交">
    </form>
</center>
</body>
</html>
