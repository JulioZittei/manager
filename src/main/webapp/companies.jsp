<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/removeCompany" var="removeLink"/>
<c:url value="/showCompany" var="editLink"/>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Companies List</title>
	</head>
	<body>
		<main>
		
			<c:if test="${not empty company}">
				<span>Company ${ company.name} Registered Successfully!</span>
			</c:if>
		
			<c:if test="${empty company}">
				<span>Nothing registered!</span>
			</c:if>
			
			<h1>Companies List</h1>
			<ul>
				<c:forEach items="${companies}" var="company">
					
					<li>
						<strong>${company.name}</strong> - <fmt:formatDate value="${company.openingDate}" pattern="dd/MM/yyyy"/>
						 - <a href="${editLink}?id=${company.id}">Edit</a> <a href="${removeLink}?id=${company.id}">Remove</a>
					</li>
				</c:forEach>
			</ul>
		</main>
	</body>
</html>