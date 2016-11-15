<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
	<!-- <div class="navbar-header">
		<button type="button" class="navbar-toggle" data-toggle="collapse"
			data-target=".navbar-collapse">
			<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
			<span class="icon-bar"></span> <span class="icon-bar"></span>
		</button>
		<a class="navbar-brand" href="javascript:;">会员网关测试</a>
	</div> -->
	<div class="navbar-collapse collapse">
		<ul class="nav navbar-nav">
			<li <c:if test="${page=='index3'}">class="active"</c:if>><a href="<c:url value="/index3" />">会员网关测试</a></li>

		</ul>
	</div>
</div>