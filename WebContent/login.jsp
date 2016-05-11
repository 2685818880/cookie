<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<br>
	<div align="center">
		<form action="userAction" method="post">
			<input name="m" type="hidden" value="login">
			<table border="1" width="400">
				<tr>
					<td align="left">用户名:</td>
					<td align="left"><input type="text" name="username"
						value="${usernames }"></td>
				</tr>
				<tr>
					<td align="left">密码:</td>
					<td align="left"><input type="password" name="password"
						value="${passwords }"> <input type="checkbox"
						name="savePassword"
						<c:if test="${savePasswords eq '1' }"> checked="checked" </c:if>
						value="1">保存密码</td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="登录"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>