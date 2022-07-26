package br.com.alura.manager.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.manager.dao.Database;
import br.com.alura.manager.domain.Company;


@WebServlet("/newCompany")
public class NewCompanyServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Registering new company!");
		
		String name = request.getParameter("name");
		String openingDate = request.getParameter("openingDate");
		
		Date formattedOpeningDate = null;
		
		try {
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			formattedOpeningDate = sdf.parse(openingDate);
		
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Company newCompany = new Company(name, formattedOpeningDate);
		
		Database database = new Database();
		database.save(newCompany);

		response.sendRedirect("companies");
	
	}
		
}
