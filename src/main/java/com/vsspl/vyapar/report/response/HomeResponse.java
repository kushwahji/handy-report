/**
 * 
 */
package com.vsspl.vyapar.report.response;

import java.util.List;

import com.vsspl.vyapar.report.repository.CompanyRepository;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author SANTOSH
 *
 */
@Data
@NoArgsConstructor
public class HomeResponse {
	public HomeResponse(CompanyRepository companyRepository) {
		// TODO Auto-generated constructor stub
	}
	private CompanyResponse company;
	List<SaleReportResponse> sales;
	List<Notification> notifications;
}
