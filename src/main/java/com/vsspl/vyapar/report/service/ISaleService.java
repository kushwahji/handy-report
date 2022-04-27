/**
 * 
 */
package com.vsspl.vyapar.report.service;

import java.util.List;

import com.vsspl.vyapar.report.request.SaleRequest;
import com.vsspl.vyapar.report.response.SaleResponse;

/**
 * @author SANTOSH
 *
 */
public interface ISaleService {

	void save(SaleRequest request);

	List<SaleResponse> getSale(String name,String uemail);

	List<SaleResponse> getPaymentStatus(String status, String uemail);

	List<SaleResponse> getSales(String uemail);

}
