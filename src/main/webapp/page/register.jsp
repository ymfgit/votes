<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html >
<html>
<head>
<base href="/vote02/">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>註冊頁面</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>
<div id="header" class="wrap">
	<img src="images/logo.gif" />
</div>
<div id="navbar" class="wrap">
	<div class="search">
	<!--  
		<form method="get" action="index.html">
			<input type="text" name="keywords" class="input-text" /><input type="submit" name="submit" class="input-button" value="" />
		</form>
	-->	
	</div>
</div>
<div id="register" class="box">
	<h2>新用户注册</h2>
	<div class="content">
	   <form method="post" action="user_register.action">
			<dl>
				<dt>用户ID：</dt>
				<dd><input type="text" class="input-text" name="vuId" value=""/></dd>
				<dt>用户名：</dt>
				<dd><input type="text" class="input-text" name="vuusername" value=""/></dd>
				<dt>密码：</dt>
				<dd><input type="password" class="input-text" name="vupassword" value=""/></dd>
				<dt>确认密码：</dt>
				<dd><input type="password" class="input-text" name="confirmPassword" value=""/></dd>
				<dt></dt>
				<dd><input type="submit" class="input-button" name="submit" value="" /></dd>
			</dl>
		</form>
		<div class="error"></div>
		<div class="error"></div>
	</div>
</div>
<div id="footer" class="wrap">
	源辰信息 &copy; 版权所有
</div>
</body>
</html>