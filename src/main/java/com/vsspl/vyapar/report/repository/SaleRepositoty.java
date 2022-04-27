/**
 * 
 */
package com.vsspl.vyapar.report.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vsspl.vyapar.report.entity.Sale;


/**
 * @author SANTOSH
 *
 */
@Repository
public interface SaleRepositoty extends JpaRepository<Sale, Long> {
	
	List<Sale> findByUemail(String uemail);

	List<Sale> findByCnameAndUemail(String name, String uemail);

	List<Sale> findByPstatusAndUemail(String status, String uemail);

}
