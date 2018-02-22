<%-- 
    Document   : index
    Created on : Feb 22, 2018, 10:52:33 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script type="text/javascript">    

    function returnJSONData()
    {
        var processData = 'JSON'; 
          $.ajax({  
            type: "GET",  
            url: "./AjaxServlet",  
            data: "processData="+processData,  
            success: function(result){
                alert("Data type process: "+result.processData
                        +" First Name: "+result.firstName
                        +" Last Name: "+result.lastName)
            },
            error: function (xhr, ajaxOptions, thrownError) {
                alert("Error status code: "+xhr.status);
                alert("Error details: "+ thrownError);
            }
          }); 

    }
        

</script>
</head>
<body>

<input type="Submit" value="JSON data from servlet" 
            onclick="returnJSONData();">

</body>
</html>