<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Company Registered Successfully</title>
</head>
<body>
	<c:if test="${not empty company}">
		<h1>Company ${ company.name} Registered Successfully!</h1>
	</c:if>
	
	<c:if test="${empty company}">
		<h1>Nothing registered!</h1>
	</c:if>
</body>
</html>