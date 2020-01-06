<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="js/login_jquery.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
<div class="header">
    <h1 class="logo"><a href="#">通讯录</a></h1>
    <ul class="register">
        <li>登</li>
        <li>录</li>
    </ul>
</div>
    <div class="content">
        <div class="content_right">
            <div class="div1">
    <ul class="nav1">
        <li>登</li>
        <li>录</li>
    </ul>
    <ul class="nav2">
        <li class="div1"><div>
            <form action="/contact_war_exploded/admin/login" method="post">
                <input type="text" name="login_adminname" class="input_username" placeholder="请输入用户名"><br/>
                <input type="password" name="login_password" class="input_password" placeholder="请输入密码"><br/>
                <input type="submit" value="提交" class="input_submit">
            </form>
        </div></li>

    </ul>
            </div>
        </div>
    </div>
<div class="mask_bg"></div>
<div class="mask"></div>
</body>
</html>