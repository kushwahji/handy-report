/**
 * 
 */
package com.vsspl.vyapar.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vsspl.vyapar.report.entity.Company;

/**
 * @author SANTOSH
 *
 */
@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

	Company findByUemail(String email);

}
