package br.com.alura.manager.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.alura.manager.domain.Company;

public class Database {
	
	private static List<Company> companies = new ArrayList<>();
	private static Integer keySequence = 1;
	
	static {
		Company bitz = new Company("Bitz", new Date());
		bitz.setId(keySequence++);
		Database.companies.add(bitz);
		
		Company bradesco = new Company("Bradesco", new Date());
		bradesco.setId(keySequence++);
		Database.companies.add(bradesco);
	}
	
	public void save(Company company) {
		company.setId(Database.keySequence++);
		Database.companies.add(company);
	}

	
	public List<Company> getCompanies() {
		return Database.companies;
	}
	
	public void removeById(Integer id) {
		Database.companies = Database.companies.stream()
				.filter((company)-> company.getId() != id).toList();
	}
	
	public Company findById(Integer id) {
		return  Database.companies.stream()
				.filter((company)-> company.getId() == id).findAny().orElseThrow();
	}

}
