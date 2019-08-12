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

		<form action="/release-year?year=${year}">

			<h3>Release Year</h3>
			<input name="year" type="number" />
			<button type="submit" class="btn btn-primary">Go!</button>
		</form>
		<form action="/runtime?lessThan=${lessThan}?greatThan=${greaterThan}">
			<h3>Runtime</h3>
			<h5>Less Than</h5>
			<input name="lessThan" type="number" value="0" />
			<h5>Greater Than</h5>
			<input name="greaterThan" type="number" value="0" />
			<button type="submit" class="btn btn-primary">Go!</button>
		</form>
		<form action="/title?name=${name}">
			<h3>Title</h3>
			<input name="name" />
			<button type="submit" class="btn btn-primary">Go!</button>

		</form>
	</div>
	
	<div class="posters">
	<c:forEach var="each" items="${movies}">
		<img
        src="https://image.tmdb.org/t/p/original/${each.posterPath}" />
	</c:forEach>
	</div>

</body>
</html>