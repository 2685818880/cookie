<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传文件</title>
</head>
<body>
	<div align="center">
		<form action="uploadAction" method="post"
			enctype="multipart/form-data">
			<table border="1">
				<tr>
					<td>文件</td>
					<td><input type="file" name="filename"></td>
				</tr>
				<tr>
					<td><input type="submit" value="上传"></td>
					<td><input type="reset" value="重置"></td>
				</tr>
			</table>
		</form>

	</div>

</body>
</html>