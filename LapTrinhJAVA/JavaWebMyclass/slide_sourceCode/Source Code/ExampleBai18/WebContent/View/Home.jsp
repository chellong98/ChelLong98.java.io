<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Upload single file</title>
</head>
<body>
	<h1>Upload single file</h1>
	<form method="POST" enctype="multipart/form-data" action="HomeController">
	  	File to upload: <input type="file" name="file">
	  	<br/>
	  	<br/>
	  	<input type="submit" value="Upload single file">
	</form>
</body>
</html>