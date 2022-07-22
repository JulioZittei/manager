<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Companies List</title>
	</head>
	<body>
		<main>
			<h1>Companies List</h1>
			<ul>
				<c:forEach items="${companies}" var="company">
					<li>${company.name}</li>
				</c:forEach>
			</ul>
		</main>
	</body>
</html>