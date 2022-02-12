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
<script src="echart/echarts.min.js" charset="UTF-8"></script>
<script src="echart/chartpie.js"></script>
</head>
<body class=" theme-blue">
	<jsp:include page="top.jsp"></jsp:include>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="content">
		<div class="main-content">
			<table class="table">
				<thead>
					<tr>
						<th class="center"><div class="text-center" id="chartmain" style="width: 99%; height: 600px;"></div></th>
					</tr>
				</thead>
			</table>
			<input type="hidden" name="basepath" value="<%=basePath%>">
			<div class="form-inline">
				<select name="clazzid" class="form-control" id="clazzid"><c:forEach items="${clazzList}" var="clazz">
						<option value="${clazz.clazzid}">${clazz.clazzname }</option>
					</c:forEach></select> &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; <label><input type="button" id="sub" value="查询"
					class="mws-button green" /> </label><span style="float: right; display: none;" id="spn"><a href="#" id="url">下载报表</a></span>
			</div>
		</div>
	</div>
</body>
</html>
