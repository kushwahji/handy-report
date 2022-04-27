/**
 * 
 */
package com.vsspl.vyapar.report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vsspl.vyapar.report.response.HomeResponse;
import com.vsspl.vyapar.report.service.HomeService;

/**
 * @author SANTOSH
 *
 */
@RestController
public class VyaparController {

	@Autowired
	HomeService service;

	@GetMapping("/home")
	public HomeResponse home(@RequestParam(name = "name") String name) {
		return service.getHome();
	}
}
