/**
 * 
 */
package com.vsspl.vyapar.report.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vsspl.vyapar.report.request.CompanyRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author SANTOSH
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "company")
@AllArgsConstructor
@NoArgsConstructor
public class Company extends AuditModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String company;
	private String address;
	private String logo;
	// Company Email
	private String cemail;
    // User login Email
	private String uemail;

	public Company(CompanyRequest request) {
		this.company = request.getCompany();
		this.address = request.getAddress();
		this.logo = request.getLogo();
		this.cemail = request.getCemail();
		this.uemail = request.getUemail();
	}
}
