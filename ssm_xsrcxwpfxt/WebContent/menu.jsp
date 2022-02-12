<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<script type="text/javascript">
	$(function() {
		var uls = $('.sidebar-nav > ul > *').clone();
		uls.addClass('visible-xs');
		$('#main-menu').append(uls.clone());
	});
</script>
<script src="lib/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript">
	$("[rel=tooltip]").tooltip();
	$(function() {
		$('.demo-cancel-click').click(function() {
			return false;
		});
	});
</script>
<c:if test="${sessionScope.role eq '管理员' }">
	<div class="sidebar-nav">
		<ul>
			<li><a data-target=".legal-menu1" class="nav-header collapsed" data-toggle="collapse">管理员信息管理<i
					class="fa fa-collapse"></i></a></li>
			<li><ul class="legal-menu1 nav nav-list collapse">
					<li><a href="admin/createAdmin.action"><span class="fa fa-caret-right"></span>新增管理员信息</a></li>
					<li><a href="admin/getAllAdmin.action"><span class="fa fa-caret-right"></span>管理员信息列表</a></li>
					<li><a href="admin/queryAdminByCond.action"><span class="fa fa-caret-right"></span>管理员信息查询</a></li>
				</ul></li>

			<li><a data-target=".legal-menu2" class="nav-header collapsed" data-toggle="collapse">班级信息管理<i
					class="fa fa-collapse"></i></a></li>
			<li><ul class="legal-menu2 nav nav-list collapse">
					<li><a href="clazz/createClazz.action"><span class="fa fa-caret-right"></span>新增班级信息</a></li>
					<li><a href="clazz/getAllClazz.action"><span class="fa fa-caret-right"></span>班级信息列表</a></li>
					<li><a href="clazz/queryClazzByCond.action"><span class="fa fa-caret-right"></span>班级信息查询</a></li>
				</ul></li>

			<li><a data-target=".legal-menu3" class="nav-header collapsed" data-toggle="collapse">教师信息管理<i
					class="fa fa-collapse"></i></a></li>
			<li><ul class="legal-menu3 nav nav-list collapse">
					<li><a href="teacher/createTeacher.action"><span class="fa fa-caret-right"></span>新增教师信息</a></li>
					<li><a href="teacher/getAllTeacher.action"><span class="fa fa-caret-right"></span>教师信息列表</a></li>
					<li><a href="teacher/queryTeacherByCond.action"><span class="fa fa-caret-right"></span>教师信息查询</a></li>
				</ul></li>

			<li><a data-target=".legal-menu4" class="nav-header collapsed" data-toggle="collapse">学生信息管理<i
					class="fa fa-collapse"></i></a></li>
			<li><ul class="legal-menu4 nav nav-list collapse">
					<li><a href="student/createStudent.action"><span class="fa fa-caret-right"></span>新增学生信息</a></li>
					<li><a href="student/getAllStudent.action"><span class="fa fa-caret-right"></span>学生信息列表</a></li>
					<li><a href="student/queryStudentByCond.action"><span class="fa fa-caret-right"></span>学生信息查询</a></li>
				</ul></li>

			<li><a data-target=".legal-menu5" class="nav-header collapsed" data-toggle="collapse">评分项目信息管理<i
					class="fa fa-collapse"></i></a></li>
			<li><ul class="legal-menu5 nav nav-list collapse">
					<li><a href="programs/createPrograms.action"><span class="fa fa-caret-right"></span>新增评分项目信息</a></li>
					<li><a href="programs/getAllPrograms.action"><span class="fa fa-caret-right"></span>评分项目信息列表</a></li>
					<li><a href="programs/queryProgramsByCond.action"><span class="fa fa-caret-right"></span>评分项目信息查询</a></li>
				</ul></li>

			<li><a data-target=".legal-menu6" class="nav-header collapsed" data-toggle="collapse">考核评分信息管理<i
					class="fa fa-collapse"></i></a></li>
			<li><ul class="legal-menu6 nav nav-list collapse">
					<li><a href="marks/getAllMarks.action"><span class="fa fa-caret-right"></span>考核评分信息列表</a></li>
					<li><a href="chart/preChart.action"><span class="fa fa-caret-right"></span>考核评分信息统计</a></li>
					<li><a href="marks/queryMarksByCond.action"><span class="fa fa-caret-right"></span>考核评分信息查询</a></li>
				</ul></li>

			<li><a data-target=".legal-menu7" class="nav-header collapsed" data-toggle="collapse">学生加分信息管理<i
					class="fa fa-collapse"></i></a></li>
			<li><ul class="legal-menu7 nav nav-list collapse">
					<li><a href="bonus/getAllBonus.action"><span class="fa fa-caret-right"></span>学生加分信息列表</a></li>
					<li><a href="bonus/queryBonusByCond.action"><span class="fa fa-caret-right"></span>学生加分信息查询</a></li>
				</ul></li>

			<li><a data-target=".legal-menu8" class="nav-header collapsed" data-toggle="collapse">学生扣分信息管理<i
					class="fa fa-collapse"></i></a></li>
			<li><ul class="legal-menu8 nav nav-list collapse">
					<li><a href="dedu/getAllDedu.action"><span class="fa fa-caret-right"></span>学生扣分信息列表</a></li>
					<li><a href="dedu/queryDeduByCond.action"><span class="fa fa-caret-right"></span>学生扣分信息查询</a></li>
				</ul></li>

		</ul>
	</div>
</c:if>
<c:if test="${sessionScope.role eq '教师' }">
	<div class="sidebar-nav">
		<ul>

			<li><a data-target=".legal-menu2" class="nav-header collapsed" data-toggle="collapse">班级信息管理<i
					class="fa fa-collapse"></i></a></li>
			<li><ul class="legal-menu2 nav nav-list collapse">
					<li><a href="clazz/queryClazzByCond.action"><span class="fa fa-caret-right"></span>班级信息查询</a></li>
				</ul></li>

			<li><a data-target=".legal-menu3" class="nav-header collapsed" data-toggle="collapse">教师信息管理<i
					class="fa fa-collapse"></i></a></li>
			<li><ul class="legal-menu3 nav nav-list collapse">
					<li><a href="teacher/queryTeacherByCond.action"><span class="fa fa-caret-right"></span>教师信息查询</a></li>
				</ul></li>

			<li><a data-target=".legal-menu4" class="nav-header collapsed" data-toggle="collapse">学生信息管理<i
					class="fa fa-collapse"></i></a></li>
			<li><ul class="legal-menu4 nav nav-list collapse">
					<li><a href="student/queryStudentByCond.action"><span class="fa fa-caret-right"></span>学生信息查询</a></li>
				</ul></li>

			<li><a data-target=".legal-menu5" class="nav-header collapsed" data-toggle="collapse">评分项目信息管理<i
					class="fa fa-collapse"></i></a></li>
			<li><ul class="legal-menu5 nav nav-list collapse">
					<li><a href="programs/queryProgramsByCond.action"><span class="fa fa-caret-right"></span>评分项目信息查询</a></li>
				</ul></li>

			<li><a data-target=".legal-menu6" class="nav-header collapsed" data-toggle="collapse">考核评分信息管理<i
					class="fa fa-collapse"></i></a></li>
			<li><ul class="legal-menu6 nav nav-list collapse">
					<li><a href="marks/createMarks.action"><span class="fa fa-caret-right"></span>新增考核评分信息</a></li>
					<li><a href="marks/getTeacherMarks.action"><span class="fa fa-caret-right"></span>我的考核评分信息列表</a></li>
					<li><a href="marks/queryMarksByCond.action"><span class="fa fa-caret-right"></span>考核评分信息查询</a></li>
				</ul></li>

			<li><a data-target=".legal-menu7" class="nav-header collapsed" data-toggle="collapse">学生加分信息管理<i
					class="fa fa-collapse"></i></a></li>
			<li><ul class="legal-menu7 nav nav-list collapse">
					<li><a href="bonus/createBonus.action"><span class="fa fa-caret-right"></span>新增学生加分信息</a></li>
					<li><a href="bonus/getTeacherBonus.action"><span class="fa fa-caret-right"></span>我的学生加分信息列表</a></li>
					<li><a href="bonus/queryBonusByCond.action"><span class="fa fa-caret-right"></span>学生加分信息查询</a></li>
				</ul></li>

			<li><a data-target=".legal-menu8" class="nav-header collapsed" data-toggle="collapse">学生扣分信息管理<i
					class="fa fa-collapse"></i></a></li>
			<li><ul class="legal-menu8 nav nav-list collapse">
					<li><a href="dedu/createDedu.action"><span class="fa fa-caret-right"></span>新增学生扣分信息</a></li>
					<li><a href="dedu/getTeacherDedu.action"><span class="fa fa-caret-right"></span>我的学生扣分信息列表</a></li>
					<li><a href="dedu/queryDeduByCond.action"><span class="fa fa-caret-right"></span>学生扣分信息查询</a></li>
				</ul></li>

		</ul>
	</div>
</c:if>
<c:if test="${sessionScope.role eq '学生' }">
	<div class="sidebar-nav">
		<ul>

			<li><a data-target=".legal-menu5" class="nav-header collapsed" data-toggle="collapse">评分项目信息管理<i
					class="fa fa-collapse"></i></a></li>
			<li><ul class="legal-menu5 nav nav-list collapse">
					<li><a href="programs/queryProgramsByCond.action"><span class="fa fa-caret-right"></span>评分项目信息查询</a></li>
				</ul></li>

			<li><a data-target=".legal-menu6" class="nav-header collapsed" data-toggle="collapse">考核评分信息管理<i
					class="fa fa-collapse"></i></a></li>
			<li><ul class="legal-menu6 nav nav-list collapse">
					<li><a href="marks/getStudentMarks.action"><span class="fa fa-caret-right"></span>我的考核评分信息列表</a></li>
				</ul></li>

			<li><a data-target=".legal-menu7" class="nav-header collapsed" data-toggle="collapse">学生加分信息管理<i
					class="fa fa-collapse"></i></a></li>
			<li><ul class="legal-menu7 nav nav-list collapse">
					<li><a href="bonus/getStudentBonus.action"><span class="fa fa-caret-right"></span>我的学生加分信息列表</a></li>
				</ul></li>

			<li><a data-target=".legal-menu8" class="nav-header collapsed" data-toggle="collapse">学生扣分信息管理<i
					class="fa fa-collapse"></i></a></li>
			<li><ul class="legal-menu8 nav nav-list collapse">
					<li><a href="dedu/getStudentDedu.action"><span class="fa fa-caret-right"></span>我的学生扣分信息列表</a></li>
				</ul></li>

		</ul>
	</div>
</c:if>
