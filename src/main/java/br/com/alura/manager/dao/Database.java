package br.com.alura.manager.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.manager.domain.Company;

public class Database {
	
	private static List<Company> companies = new ArrayList<>();
	
	public void add(Company company) {
		Database.companies.add(company);
	}
	
	public List<Company> getCompanies() {
		return Database.companies;
	}

}
