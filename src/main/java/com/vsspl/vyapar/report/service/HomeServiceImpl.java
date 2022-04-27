/**
 * 
 */
package com.vsspl.vyapar.report.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vsspl.vyapar.report.repository.CompanyRepository;
import com.vsspl.vyapar.report.repository.SaleRepositoty;
import com.vsspl.vyapar.report.response.HomeResponse;

/**
 * @author SANTOSH
 *
 */
@Service
public class HomeServiceImpl implements HomeService {
	
	@Autowired
	CompanyRepository companyRepository;
	
	@Autowired
	SaleRepositoty saleRepositoty;

	@Override
	public HomeResponse getHome() {
		HomeResponse response = new HomeResponse(companyRepository);
		return response;
	}

}
