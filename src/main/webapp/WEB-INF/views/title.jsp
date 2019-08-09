<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Title Search</title>
</head>
<body>

<form action="/movie" method="get" ></form>
<div class="container">
		
		<h1>Title Search</h1>
					
		<ul>					
			
			<c:forEach var="i" items="${title }">
			 
			 	<li>${i.title }</li>
			 
			</c:forEach>
		</ul>
</div>		

</body>
</html>