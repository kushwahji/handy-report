/**
 * 
 */
package com.vsspl.vyapar.report.controller;

import java.util.stream.Collectors;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.vsspl.vyapar.report.request.CompanyRequest;

import com.vsspl.vyapar.report.response.CompanyResponse;
import com.vsspl.vyapar.report.service.ICompanyService;

/**
 * @author SANTOSH
 *
 */
@CrossOrigin(origins = "http://localhost:9000")
@RestController
public class CompanyControllor {
	
	@Autowired
	ICompanyService companyService;
	
	@Autowired
	RestTemplate restTemplate;
	

	
	@PostMapping("/create-company")
	public void save(@Valid @RequestBody CompanyRequest request) {
		companyService.save(request);
	}
	
	@GetMapping("/company")
	public CompanyResponse getCompany(@RequestParam(name = "email") String email) {
		return companyService.getCompany(email);
		
	}
	/*
	 * @GetMapping("/api") public APIExpectedResponse api(@RequestParam(name =
	 * "apiKey") String apiKey) { double lng = -73.961452; double lat = 40.714224;
	 * return
	 * gapi.AddressApi(lat,lng,apiKey).getResults().stream().filter(f->f.getGeometry
	 * ().getLocation().getLat()==lat &&
	 * f.getGeometry().getLocation().getLng()==lng).map(m->new
	 * APIExpectedResponse(m)).findFirst().get();
	 * 
	 * }
	 */

}
