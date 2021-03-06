<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="check_logstate.jsp" />
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<style type="text/css">
.navbar-default .navbar-brand, .navbar-default .navbar-brand:hover {
	color: #fff;
}
</style>
<div class="navbar navbar-default" role="navigation">
	<div class="navbar-header">
		<a class=""><span class="navbar-brand"><span class="fa fa-paper-plane"></span>欢迎使用学生日常行为评分系统</span></a>
	</div>
	<div class="navbar-collapse collapse" style="height: 1px;">
		<ul id="main-menu" class="nav navbar-nav navbar-right">
			<li class="dropdown hidden-xs"><a class="dropdown-toggle" data-toggle="dropdown"> <span
					class="glyphicon glyphicon-user padding-right-small" style="position: relative; top: 3px;"></span>
					${sessionScope.realname }&nbsp;&nbsp;您的身份&nbsp;&nbsp;${sessionScope.role }&nbsp;&nbsp;&nbsp;
			</a></li>
			<li class="dropdown hidden-xs"><a class="dropdown-toggle" data-toggle="dropdown"> <span id="time"></span> <script>
				document.getElementById('time').innerHTML = new Date()
						.toLocaleString()
						+ ' 星期' + '日一二三四五六'.charAt(new Date().getDay());
				setInterval(
						"document.getElementById('time').innerHTML=new Date().toLocaleString()+' 星期'+'日一二三四五六'.charAt(new Date().getDay());",
						1000);
			</script></a></li>
			<c:if test="${sessionScope.role eq '管理员' }">
				<li class="dropdown hidden-xs"><a href="<%=basePath%>editpwd.jsp" title=""><span>修改密码</span></a></li>
			</c:if>
			<c:if test="${sessionScope.role eq '教师' }">
				<li class="dropdown hidden-xs"><a href="<%=basePath%>editpwd1.jsp" title=""><span>修改密码</span></a></li>
			</c:if>
			<c:if test="${sessionScope.role eq '学生' }">
				<li class="dropdown hidden-xs"><a href="<%=basePath%>editpwd1.jsp" title=""><span>修改密码</span></a></li>
			</c:if>
			<li class="dropdown hidden-xs"><a href="<%=basePath%>login/exit.action"
				onclick="{if(confirm('确定要退出吗?')){return true;}return false;}" title=""><span>退出系统</span></a></li>
		</ul>
	</div>
</div>