package br.com.alura.manager.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
		
		String companyName = request.getParameter("name");
		Company newCompany = new Company(companyName);
		
		Database database = new Database();
		database.add(newCompany);
		
		request.setAttribute("company", newCompany);
		RequestDispatcher dispatcher = request.getRequestDispatcher("registered-company.jsp");
		dispatcher.forward(request, response);
	}

}
