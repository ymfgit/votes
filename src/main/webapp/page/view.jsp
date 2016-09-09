<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html >
<html>
<head>
<base href="/vote02/">
<meta charset="utf-8">
<title>view</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />

</head>
<body>
 
<div id="header" class="wrap">
	<img src="images/logo.gif" />
</div>
<div id="navbar" class="wrap">
	<div class="profile">
		<c:choose>
			<c:when test="${sessionScope.loginUser.vuusername eq null }"></c:when>
			<c:otherwise>您好,${sessionScope.loginUser.vuusername} </c:otherwise>
		</c:choose>
		<span class="return"><a href="vote_list.action">返回列表</a></span>
		<span class="addnew"><a href="subject_save.action">添加新投票</a></span>
		<span class="modify"><a href="subject_modify.action">维护</a></span>
	</div>
	<div class="search">
		<form method="post" action="Subject!search.action">
			<input type="text" name="keywords" class="input-text" value=""/><input type="submit" name="submit" class="input-button" value="" />
		</form>
	</div>
</div>

<div id="vote" class="wrap">
	<h2>查看投票</h2>
	 <ul class="list">
		<li>
		<h4>${sessionScope.optionBean.vsTitle}</h4>
			<p class="info">共有 ${sessionScope.optionBean.optionCount}个选项，已有 ${sessionScope.optionBean.voteUserCount} 个网友参与了投票。</p>
				<ol>
				   <c:forEach items="${sessionScope.optionBean.voteOptionCount}" var="voCount">
				   		<li>
						<div class="rate">
							<div class="ratebg">
								<div class="percent" style='width:
									<c:choose>
										<c:when test="${sessionScope.optionBean.voteUserCount==0}">0</c:when>
										<c:otherwise>
											<fmt:formatNumber value=" ${voCount/sessionScope.optionBean.voteUserCount}" type="percent" maxFractionDigits="2"/> 
										</c:otherwise>
									</c:choose>
								'>
								</div>
						</div>
							<p>${voCount }票<span>(
								<c:choose>
									<c:when test="${sessionScope.optionBean.voteUserCount==0}">0</c:when>
									<c:otherwise><fmt:formatNumber value=" ${voCount/sessionScope.optionBean.voteUserCount}" type="percent" maxFractionDigits="2"/> </c:otherwise>
								</c:choose>)</span>
							</p>
						</div>
					</li>
				   </c:forEach>
				</ol>
				<div class="goback"><a href="vote_list.action">返回投票列表</a></div>
		</li>
	</ul>
</div>
<div id="footer" class="wrap">
	源辰信息 &copy; 版权所有
</div>
</body>
</html>
