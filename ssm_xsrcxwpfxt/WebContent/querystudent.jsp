<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%><%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%><jsp:include page="check_logstate.jsp"></jsp:include>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%><!doctype html>
<html lang="zh_CN">
<head>
<base href="<%=basePath%>" />
<title>欢迎使用学生日常行为评分系统</title>
<link rel="stylesheet" type="text/css" href="lib/bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">
<script src="lib/jquery-1.11.1.min.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="stylesheets/theme.css">
<link rel="stylesheet" type="text/css" href="stylesheets/premium.css">
</head>
<body class=" theme-blue">
	<jsp:include page="top.jsp"></jsp:include>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="content">
		<div class="header">
			<h1 class="page-title">学生信息列表</h1>
		</div>
		<div class="main-content">
			<table class="table">
				<thead>
					<tr>
						<th class="text-center">学号</th>
						<th class="text-center">姓名</th>
						<th class="text-center">性别</th>
						<th class="text-center">出生日期</th>
						<th class="text-center">民族</th>
						<th class="text-center">籍贯</th>
						<th class="text-center">联系方式</th>
						<th class="text-center">家庭住址</th>
						<th class="text-center">班级</th>
						<th class="text-center">备注</th>
						<th class="text-center">创建日期</th>
					</tr>
				</thead>
				<c:forEach items="${studentList}" var="student">
					<tr align="center">
						<td class="center">${student.username}</td>
						<td class="center">${student.realname}</td>
						<td class="center">${student.sex}</td>
						<td class="center">${student.birthday}</td>
						<td class="center">${student.minzu}</td>
						<td class="center">${student.jiguan}</td>
						<td class="center">${student.contact}</td>
						<td class="center">${student.address}</td>
						<td class="center">${student.clazzname}</td>
						<td class="center">${student.memo}</td>
						<td class="center">${student.addtime}</td>
					</tr>
				</c:forEach>
			</table>
			<ul class="pagination">
				<li>
					<form action="student/queryStudentByCond.action" name="myform" method="post">
						<label>查询条件: <select name="cond" style="width: 100px">
								<option value="username">按学号查询</option>
								<option value="password">按密码查询</option>
								<option value="realname">按姓名查询</option>
								<option value="sex">按性别查询</option>
								<option value="birthday">按出生日期查询</option>
								<option value="minzu">按民族查询</option>
								<option value="jiguan">按籍贯查询</option>
								<option value="contact">按联系方式查询</option>
								<option value="address">按家庭住址查询</option>
								<option value="clazzid">按班级查询</option>
								<option value="memo">按备注查询</option>
								<option value="addtime">按创建日期查询</option>
						</select>
						</label>&nbsp;&nbsp;&nbsp; <label>关键字: <input type="text" name="name" required style="width: 100px" /></label>&nbsp;&nbsp;&nbsp;
						<label><input type="submit" value="查询" class="mws-button green" /> </label>${html }
					</form>
				</li>
			</ul>
		</div>
	</div>
</body>
</html>
