<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.alura.manager.domain.Company" %>
<% Company company = (Company) request.getAttribute("company"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Company Registered Successfully</title>
</head>
<body>
	<h1>Company <%= company.getName() %> Registered Successfully!</h1>
</body>
</html>