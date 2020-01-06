<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>公司年检信息</title>
<link href="${pageContext.request.contextPath }/resource/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="${pageContext.request.contextPath }/resource/jquery-3.2.1.js"></script>
</head>
<body>
	<h1 style="font-family: cursive; margin-top: 20px; margin-bottom: 20px;" align="center">公司年检信息</h1>
	<form id="fid" action="${pageContext.request.contextPath }/selectCompany" method="post">
		编号：<input type="text" name="id" value="${companyVO.id}">
		关键字：<input type="text" name="nickName" value="${companyVO.nickName}">
		描述：<input type="text" name="miaoshu" value="${companyVO.miaoshu}"><br>
		公司名称：<input type="text" name="name" value="${companyVO.name}">
		主要产品：<input type="text" name="goods" value="${companyVO.goods}">
		地址：<input type="text" name="address" value="${companyVO.address}"><br>
		开始注册资本：<input type="text" name="startMoney" value="${companyVO.startMoney}">
		结束注册资本：<input type="text" name="endMoney" value="${companyVO.endMoney}"><br>
		开始成立日期：<input type="date" name="startBirthday" value="${companyVO.startBirthday}">
		结束成立日期：<input type="date" name="endBirthday" value="${companyVO.endBirthday}"><br>
		开始年检日期：<input type="date" name="startCheckDate" value="${companyVO.startCheckDate}">
		结束年检日期：<input type="date" name="endCheckDate" value="${companyVO.endCheckDate}">
		<input type="submit" value="查询"  class="btn btn-success">
	</form>
	<table class="table table-hover">
		<tr align="center">
			<td>编号</td>
			<td>关键字</td>
			<td>描述</td>
			<td>公司名称</td>
			<td>主要产品</td>
			<td>地址</td>
			<td>注册资本</td>
			<td>成立时间</td>
			<td>年检日期</td>
			<td>年间状态</td>
			<td>备注</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${info.list}" var="li">
			<tr>
				<td>${li.id}</td>
				<td>${li.nickName}</td>
				<td>${li.miaoshu}</td>
				<td>${li.name}</td>
				<td>${li.goods}</td>
				<td>${li.address}</td>
				<td>${li.money}</td>
				<td> <fmt:formatDate value="${li.birthday}" pattern="yyyy-MM-dd"/> </td>
				<td> <fmt:formatDate value="${li.checkDate}" pattern="yyyy-MM-dd"/> </td>
				<td>${li.status==1?"已通过":"未通过"}</td>
				<td>${li.beizhu}</td>
				<td> <a href="${pageContext.request.contextPath }/updateCompany?id=${li.id}"> <input type="button" value="年检审核" class="btn btn-success"> </a> </td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="100" align="center">
				<jsp:include page="/WEB-INF/views/pages2.jsp"></jsp:include>
			</td>
		</tr>
	</table>
</body>
<script type="text/javascript">
	function goPage(page) {
		location.href="${pageContext.request.contextPath }/selectCompany?page="+page+"&"+$("#fid").serialize();
	}
</script>
</html>