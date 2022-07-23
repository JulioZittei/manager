<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/editCompany" var="linkForm"/>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Update Company</title>
		<style>
			* {
			  margin: 0;
			  padding: 0;
			  box-sizing: border-box;
			}
			
			body {
				display: flex; 
				justify-content: center; 
				align-items: center; 
				width:100vw; 
				height:100vh;
			}
			
			.form-row {
				width:100%;
				display: flex;
				flex-direction: column;
			}
			
			label {
				font-weight: bold;
				margin-bottom: 8px;
			}
			
			input {
				padding: 8px;
			}
			
			button {
				width: 100%;
				padding: 8px;
			}
			
			.form-row:not(last-child) {
				margin-bottom: .5rem;
			}
			
		</style>
	</head>
	<body>
	
	
		<main>
			<form action="${linkForm}" method="POST">
				<div class="form-row">
					<input type="hidden" name="id" value="${company.id }">
					<label for="name">Name: </label> <input type="text" id="name" name="name" value="${company.name }" required/>
				</div>
				<div class="form-row">
					<fmt:formatDate value="${company.openingDate}" pattern="dd/MM/yyyy" var="openingDate"/>
					<label for="openingDate">Opening date: </label> <input type="text" id="openingDate" name="openingDate" value="${openingDate}"/>
				</div>
				<div class="form-row">
					<button type="submit">Enviar</button>
				</div>
			</form>
		</main>
	</body>
</html>