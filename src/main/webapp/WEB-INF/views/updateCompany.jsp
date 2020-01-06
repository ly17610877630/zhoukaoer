<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath }/resource/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="${pageContext.request.contextPath }/resource/jquery-3.2.1.js"></script>
</head>
<body>
	<div align="center">
		<form:form action="${pageContext.request.contextPath }/updateCompany" id="fid" method="post" modelAttribute="company">
			<form:hidden path="id"/><br>
			关键字：<form:input path="nickName"/><br>
			描述：<form:input path="miaoshu"/><br>
			公司名称：<form:input path="name"/><br>
			主要产品：<form:input path="goods"/><br>
			地址：<form:input path="address"/><br>
			注册资金：<form:input path="money"/><br>
			成立时间：<form:input path="birthday"/><br>
			年检时间：<form:input path="checkDate"/><br>
			年检状态：
				<select name="status" id="status">
					<option >请选择</option>
					<option value="1">通过</option>
					<option value="0">待定</option>
					<option value="-1">未通过</option>
				</select><br>
			备注：<form:input path="beizhu"/><br>
			<input type="button" value="审核" class="btn btn-warning" onclick="doUpdate()">
		</form:form>
	</div>
</body>
<script type="text/javascript">
	function doUpdate() {
		var data = $("#fid").serialize();
		alert(data);
		$.ajax({
			url:'${pageContext.request.contextPath }/updateCompany',
			type:'post',
			data:data,
			success:function(obj){
				if(obj){
					alert("审核成功");
					location.href="${pageContext.request.contextPath}/selectCompany";
				}else{
					alert("审核失败");
				}
			}
		});
	}
</script>
</html>