/**
 * 
 */
package com.vsspl.vyapar.report.service;

import com.vsspl.vyapar.report.request.CompanyRequest;
import com.vsspl.vyapar.report.response.CompanyResponse;

/**
 * @author SANTOSH
 *
 */
public interface ICompanyService {

	void save(CompanyRequest request);

	CompanyResponse getCompany(String email);

}
