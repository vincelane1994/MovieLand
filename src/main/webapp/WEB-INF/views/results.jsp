<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Movie Land</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/spacelab/bootstrap.min.css"
	rel="stylesheet" crossorigin="anonymous">
<link href="/styles.css" rel="stylesheet" />
</head>
<body>
	<div class="container">

		<h1>Movie Land</h1>

		<table class="table">
			<thead>
				<tr>
					<th>Title</th>
					<th>Overview</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="each" items="${movies}">
					<tr>
						<td><a href="/detail?id=${each.id}">${each.title}</a></td>
						<td>${each.overview}</td>
						<td><a href="/detail?id=${each.id}"><img class="img" src="https://image.tmdb.org/t/p/original/${each.posterPath}"/></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>