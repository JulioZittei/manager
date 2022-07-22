<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.alura.manager.domain.Company" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Companies List</title>
</head>
<body>
		<ul>
		<%
			List<Company> companies = (List<Company>) request.getAttribute("companies");
			for(Company company : companies) {
		%>
		
			<li>
				<%= company.getName() %>
			</li>
		
		<%
			}
		%>
		
		</ul>

</body>
</html>