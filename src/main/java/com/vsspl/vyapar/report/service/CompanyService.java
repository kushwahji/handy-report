/**
 * 
 */
package com.vsspl.vyapar.report.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vsspl.vyapar.report.entity.Company;
import com.vsspl.vyapar.report.repository.CompanyRepository;
import com.vsspl.vyapar.report.request.CompanyRequest;
import com.vsspl.vyapar.report.response.CompanyResponse;

/**
 * @author SANTOSH
 *
 */
@Service
public class CompanyService implements ICompanyService {

	@Autowired
	CompanyRepository repository;

	@Override
	public void save(CompanyRequest request) {
		repository.save(new Company(request));
	}

	@Override
	public CompanyResponse getCompany(String email) {
		return new CompanyResponse(repository.findByUemail(email));
	}

}
