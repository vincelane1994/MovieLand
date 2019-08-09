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
<p>Length: ${movies.runtime}mins</p>
<p>Release Date: ${movies.releaseDate}</p>
<p>Revenue: ${movies.revenue}</p>
<p>Budget: ${movies.budget}</p>
<p><h4>Overview</h4>${movies.overview}</p>


</div>
</body>
</html>