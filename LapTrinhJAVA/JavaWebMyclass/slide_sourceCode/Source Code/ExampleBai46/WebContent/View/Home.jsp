<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>

		<script type="text/javascript">
		
				function Validate()
				{
					var username = document.myform.username.value;
					var password = document.myform.password.value;
					
					if (username == "")
					{
						document.getElementById("errorname").innerHTML = "không đễ trống username";
					}
					else 
					{
						document.getElementById("errorname").innerHTML = "";
					}
					if (password == "")
					{
						document.getElementById("errorpass").innerHTML = "không đễ trống password";
					}
					else 
					{
						document.getElementById("errorpass").innerHTML = "";
						if (password.length<=6)
						{
							document.getElementById("errorpass").innerHTML = "Độ dài password >6";
						}
						else 
						{
							document.getElementById("errorpass").innerHTML = "";
						}
					}
				}
		
		
		</script>
</head>
<body>
	<form name ="myform">
	
			<input type="text" name="username" onkeyup="Validate()"/> 
			<p id="errorname"></p>
			
			<input type="password" name="password" onkeyup="Validate()"/>
			<p id="errorpass"></p>
			
			<input type="button" value="Validate" onclick="Validate()"/>
	
	</form>
</body>
</html>