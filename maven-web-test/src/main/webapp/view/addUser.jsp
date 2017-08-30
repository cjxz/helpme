<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加新员工</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/user/addUser" method="post" >
		userName : <input name="userName" type="text"/><br><br>
		userAge　: <input name="userAge" type="text"/><br><br>
		userAddress :　<input name="userAddress" type="text"/><br><br>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>