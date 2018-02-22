<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Example Javascript</title>
	<script type="text/javascript">
	
			//alert("Hello Myclass.vn");
			//document.write("Hello Myclass.vn");
			//var a = 10;
			//var str = "myclass.vn";
			//var check = false;
				
			/*var score = 6;
			
			if (score > 8)
			{
				alert("Bạn được học sinh giỏi");
			}
			else
			{
				alert("Bạn học sinh khá");
			}*/
			
			/*var num = 5;
			var kq=1;
			for (var i = 1;i<=num;i++)
			{
					kq = kq * i;
			}
			alert(kq);*/
			
			/*var num = 5;
			var i = 1;
			var kq = 1;
			while (i<=num)
			{
				kq = kq * i;
				i++;
			}
			alert(kq);*/
			
			function Kiemtrathongtin()
			{
				var name = document.myform.name.value;
				
				if (name == null || name == "")
				{
						alert("Không được để trống");	
						return false;
				}
				
			}
			
		
	</script>
</head>
<body>
	<!-- form name ="myform">
		<input type ="text" name = "name"/>
	</form-->
	
	<!--input type="button" value ="Hiển thị" onclick="Xuatthongtin()"/-->
	
	<form action="Demo" method="POST" onsubmit="return Kiemtrathongtin()" name ="myform">
	
			<input type ="text" name ="name"/>
			<input type ="submit" value ="Xuất thông tin"/>
				
	</form>
</body>
</html>