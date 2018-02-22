<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Upload multiple file</title>
<script src="js/jquery-3.1.1.min.js">
	</script>
	<script>
	    $(document)
	            .ready(
	                    function() {
	                        //add more file components if Add is clicked
	                        $('#addFile')
	                                .click(
	                                        function() {
	                                            var fileIndex = $('#fileTable tr')
	                                                    .children().length - 1;
	                                            $('#fileTable')
	                                                    .append(
	                                                            '<tr><td>'
	                                                                    + '   <input type="file" name="files['+ fileIndex +']" />'
	                                                                    + '</td></tr>');
	                                        });
	 
	                    });
	</script>
</head>
<body>
	<h1>Upload multiple file</h1>
	<form method="POST" enctype="multipart/form-data" action="HomeController">
		 	<table id="fileTable">
		 			 <tr>
                   		 <td><input name="files[0]" type="file" /></td>
               		 </tr>
                	<tr>
                   		 <td><input name="files[1]" type="file" /></td>
                	</tr>		  	
		 	 </table>
			 <br/>
			 <input type="submit" value="Upload multiple file">
			 <input id="addFile" type="button" value="Add File" />
	</form>
</body>
</html>