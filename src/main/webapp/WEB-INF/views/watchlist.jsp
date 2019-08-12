<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css" />
</head>
<body>
	<table class="table">
		<thead>
			<tr>
				<th>Title</th>
				<th>Overview</th>
				<th>Run Time</th>
				<th>Release Date</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="each" items="${movies}">
				<tr>
					<td><a href="/detail?id=${each.id}">${each.title}</a></td>
					<td>${each.overview}</td>
					<td>${each.runtime}</td>
					<td>${each.releaseDate}</td>
					<td><a href="/remove?id=${each.movieId}"><button type="button" class="btn btn-danger">Remove</button></a><td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/"><button type="button" class="btn btn-outline-success">Home</button></a>
</body>
</html>