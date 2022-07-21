package br.com.alura.manager.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.manager.dao.Database;
import br.com.alura.manager.domain.Company;


@WebServlet("/companies")
public class ListOfCompaniesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Listing companies!");
		PrintWriter writer = response.getWriter();
		
		Database database = new Database();
		List<Company> companies = database.getCompanies();
		
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<ul>");
		companies.stream().forEach((company)-> {
			writer.println("<li>");
			writer.println(company.getName());
			writer.println("</li>");
		});
		writer.println("</ul>");
		writer.println("<body>");
		writer.println("</html>");
		
	}
		

}
