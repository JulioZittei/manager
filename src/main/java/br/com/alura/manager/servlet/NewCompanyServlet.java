package br.com.alura.manager.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.manager.dao.Database;
import br.com.alura.manager.domain.Company;


@WebServlet("/new-company")
public class NewCompanyServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Registering new company!");
		PrintWriter writer = response.getWriter();
		
		String nameOfCompany = request.getParameter("name");
		Company newCompany = new Company(nameOfCompany);
		
		Database database = new Database();
		database.add(newCompany);
		
		writer.println("<html><body><h1>Company "+ newCompany.getName() +" Registered Successfully!</h1></body></html>");
		
	}

}
