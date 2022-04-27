/**
 * 
 */
package com.vsspl.vyapar.report.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author SANTOSH
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyRequest {
	private String company;
	private String address;
	private String logo;
	private String cemail;
	private String uemail;
}
