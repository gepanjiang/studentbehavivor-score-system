<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="check_logstate.jsp"></jsp:include>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!doctype html>
<html lang="zh_CN">
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
			<h1 class="page-title">评分项目信息列表</h1>
		</div>
		<div class="main-content">
			<table class="table">

				<thead>
					<tr>
						<th class="text-center">标题</th>
						<th class="text-center">内容</th>
						<th class="text-center">评分标准</th>
						<th class="text-center">权重</th>
						<th class="text-center">备注</th>
						<th class="text-center">创建日期</th>
						<th class="text-center">操作</th>
					</tr>
				</thead>
				<c:forEach items="${programsList}" var="programs">
					<tr align="center">
						<td>${programs.title}</td>
						<td>${programs.contents}</td>
						<td>${programs.standards}</td>
						<td>${programs.weights*100}%</td>
						<td>${programs.memo}</td>
						<td>${programs.addtime}</td>
						<td><a href="programs/getProgramsById.action?id=${programs.programsid}"><i class="fa fa-pencil"></i></a>&nbsp;&nbsp;<a
							href="programs/deletePrograms.action?id=${programs.programsid}"
							onclick="{if(confirm('确定要删除吗?')){return true;}return false;}"><i class="fa fa-trash-o"></i></a></td>
					</tr>
				</c:forEach>
			</table>
			<div class="pagination">${html }</div>
		</div>
	</div>
</body>
</html>
