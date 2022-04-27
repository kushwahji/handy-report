/**
 * 
 */
package com.vsspl.vyapar.report.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vsspl.vyapar.report.request.SaleRequest;
import com.vsspl.vyapar.report.response.SaleResponse;
import com.vsspl.vyapar.report.service.ISaleService;

/**
 * @author SANTOSH
 *
 */
@CrossOrigin(origins = "http://localhost:9000")
@RestController
public class SaleControllor {
	
	@Autowired
	ISaleService saleService;
	
	@PostMapping("/create-sale")
	public void save(@Valid @RequestBody SaleRequest request) {
		 saleService.save(request);
	}
	
	@GetMapping("/sale")
	public List<SaleResponse> getSale(@RequestParam(name = "name") String name,@RequestParam(name = "uemail") String uemail) {
		return saleService.getSale(name,uemail);
		
	}
	
	@GetMapping("/pay-status")
	public List<SaleResponse> getPaymentStatus(@RequestParam(name = "status") String status,@RequestParam(name = "uemail") String uemail) {
		return saleService.getPaymentStatus(status,uemail);
		
	}
	
	@GetMapping("/sales")
	public List<SaleResponse> getSales(@RequestParam(name = "uemail") String uemail) {
		return saleService.getSales(uemail);
		
	}

}
