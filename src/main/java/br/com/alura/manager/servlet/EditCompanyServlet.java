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


@WebServlet("/editCompany")
public class EditCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Updating company!");
		
		String name = (String) request.getParameter("name");
		String openingDate = (String) request.getParameter("openingDate");
		String id = (String) request.getParameter("id");
		
		Date formattedOpeningDate = null;
		
		try {
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			formattedOpeningDate = sdf.parse(openingDate);
		
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Database database = new Database();
		Company existingCompany = database.findById(Integer.valueOf(id));
		
		existingCompany.setName(name);
		existingCompany.setOpeningDate(formattedOpeningDate);
		
		response.sendRedirect("companies");
	
	}

}
