/**
 * 
 */
package com.vsspl.vyapar.report.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vsspl.vyapar.report.entity.Sale;
import com.vsspl.vyapar.report.repository.SaleRepositoty;
import com.vsspl.vyapar.report.request.SaleRequest;
import com.vsspl.vyapar.report.response.SaleResponse;

/**
 * @author SANTOSH
 *
 */
@Service
public class SaleServiceImpl implements ISaleService{

	@Autowired
	SaleRepositoty saleRepositoty;
	
	@Override
	public void save(SaleRequest request) {
		 saleRepositoty.save(new Sale(request));
	}

	@Override
	public List<SaleResponse> getSale(String name,String uemail) {
		return saleRepositoty.findByCnameAndUemail(name,uemail).stream().map(r-> new SaleResponse(r)).collect(Collectors.toList());
	}

	@Override
	public List<SaleResponse> getSales(String uemail) {
		return saleRepositoty.findByUemail(uemail).stream().map(r-> new SaleResponse(r)).collect(Collectors.toList());
	}

	@Override
	public List<SaleResponse> getPaymentStatus(String status, String uemail) {
		return saleRepositoty.findByPstatusAndUemail(status,uemail).stream().map(r-> new SaleResponse(r)).collect(Collectors.toList());
	}

}
