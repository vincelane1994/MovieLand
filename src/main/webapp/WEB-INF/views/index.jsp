<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Movie Land</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css" />
<link href="/styles.css" rel="stylesheet" />
</head>
<body>
	<div class="container">

		<h1>Movie Land</h1>
		<table>
			<tr>
				<td class="outline">Release Year</td>
				<td class="right"><form action="/release-year?year=${year}">
						<table>
							<tr>
								<td class="tdr"><input name="year" type="number" /></td>
								<td class="tdr"><button type="submit"
										class="btn btn-primary">Go!</button></td>
							</tr>
						</table>
					</form></td>
			</tr>
			<tr>
				<td>Runtime</td>
				<td class="right">
					<form
						action="/runtime?lessThan=${lessThan}?greatThan=${greaterThan}">
						<table>
							<tr>
								<td class="tdr">Less Than <input name="lessThan"
									type="number" value="0" /><br> Greater Than <input
									name="greaterThan" type="number" value="0" /></td>
								<td class="tdr"><button type="submit"
										class="btn btn-primary">Go!</button></td>
							</tr>
						</table>
					</form>
				</td>
			</tr>
			<tr>
				<td>Title:</td>
				<td class="right">
					<form action="/title?name=${name}">
						<table class="tdr">
							<tr class="tdr">
								<td class="tdr"><input name="name" /></td>
								<td class="tdr"><button type="submit"
										class="btn btn-primary">Go!</button></td>
							</tr>
						</table>
					</form>
				</td>
			</tr>
		</table>
	</div>
	<div class="posters">
		<c:forEach var="each" items="${movies}">
			<a href="/detail?id=${each.id}"><img src="https://image.tmdb.org/t/p/original/${each.posterPath}"/></a>
		</c:forEach>
	</div>
</body>
</html>