/**
 * 
 */
package com.vsspl.vyapar.report.response;

import com.vsspl.vyapar.report.entity.Company;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author SANTOSH
 *
 */
@Data
@NoArgsConstructor
public class CompanyResponse {
	private String company;
	private String address;
	private String logo;
	private String cemail;
	private String uemail;
	public CompanyResponse(Company company) {
		super();
		this.company = company.getCompany();
		this.address = company.getAddress();
		this.logo = company.getLogo();
		this.cemail = company.getCemail();
		this.uemail = company.getUemail();
	}

}
