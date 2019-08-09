<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/styles.css" />
<link red="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css" />
</head>
<body>
<h1>${movies.title}</h1>
<a href="https://image.tmdb.org/t/p/original/${movies.posterPath}"><img src="https://image.tmdb.org/t/p/original/${movies.posterPath}"/></a>
<div>
<table>
	<tr><td>Length: </td><td>${movies.runtime}mins</td></tr>
	<tr><td>Release Date: </td><td>${movies.releaseDate}</td></tr>
	<tr><td>Revenue: </td><td>${movies.revenue}</td></tr>
	<tr><td>Budget: </td><td>${movies.budget}</td></tr>
</table>
<p><h4>Overview</h4>${movies.overview}</p>


</div>
</body>
</html>