<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传实例 - 菜鸟教程</title>
</head>
<body>
<h1>文件上传实例 - 菜鸟教程</h1>
<form method="post" action="uploadfile" enctype="multipart/form-data">
	选择一个文件:
	<input type="file" name="uploadFile" />
	<br/><br/>
	<input type="submit" value="上传" />
</form>
</body>
</html>