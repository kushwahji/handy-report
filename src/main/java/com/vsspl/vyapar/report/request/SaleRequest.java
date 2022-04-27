/**
 * 
 */
package com.vsspl.vyapar.report.request;

import java.math.BigDecimal;
import java.util.List;

import com.vsspl.vyapar.report.entity.Items;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author SANTOSH
 *
 */
@Data
@NoArgsConstructor
public class SaleRequest {
	private String cname;
	private String phone;
	private String pstatus;
	private BigDecimal paidAmount;
	List<Items> items;
	private String uemail;
}
