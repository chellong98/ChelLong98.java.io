<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result Page</title>
</head>
<body>
		
		<form action="QuizForward">
		<c:forEach items = "${listcorrectanswer}" var = "listcorrectanswer">
			<c:forEach items = "${listansweruser}" var = "listansweruser">
			
				<c:if test="${listcorrectanswer.number == listansweruser.number}">
					<c:if test="${listcorrectanswer.correctanswer == 'A'}">
							<c:if test="${listansweruser.answer == 'A'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  <img alt="" src="Image/correct.png"> ${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
								
							<c:if test="${listansweruser.answer == 'B'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option1}
								<br>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.answer == 'C'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.answer == 'D'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option4}
								<br>
							</c:if>
					
					</c:if>
					
					<c:if test="${listcorrectanswer.correctanswer == 'B'}">
						
							<c:if test="${listansweruser.answer == 'A'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option1}
								<br>
								  <img alt="" src="Image/correct.png"> ${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
								
							<c:if test="${listansweruser.answer == 'B'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  ${listcorrectanswer.option1}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.answer == 'C'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  ${listcorrectanswer.option1}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option2}
								<br>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.answer == 'D'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  ${listcorrectanswer.option1}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option4}
								<br>
							</c:if>
					
					
					</c:if>
					<c:if test="${listcorrectanswer.correctanswer == 'C'}">
						
							<c:if test="${listansweruser.answer == 'A'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option1}
								<br>
								   ${listcorrectanswer.option2}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
								
							<c:if test="${listansweruser.answer == 'B'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  ${listcorrectanswer.option1}
								<br>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option2}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.answer == 'C'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  ${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.answer == 'D'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  ${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option3}
								<br>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option4}
								<br>
							</c:if>
					
					
					</c:if>
					<c:if test="${listcorrectanswer.correctanswer == 'D'}">
						
					
							<c:if test="${listansweruser.answer == 'A'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option4}
								<br>
							</c:if>
								
							<c:if test="${listansweruser.answer == 'B'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  ${listcorrectanswer.option1}
								<br>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.answer == 'C'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  ${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  <img alt="" src="Image/incorrect.png">${listcorrectanswer.option3}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.answer == 'D'}">
								<p>${listcorrectanswer.number}. ${listcorrectanswer.question}</p>
								  ${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  <img alt="" src="Image/correct.png">${listcorrectanswer.option4}
								<br>
							</c:if>
					
					</c:if>
				</c:if>	
			</c:forEach>
		</c:forEach>
			<br/>
			<input type = "submit" value = "Again"/>
		</form>
</body>
</html>