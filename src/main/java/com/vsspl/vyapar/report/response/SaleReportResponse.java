/**
 * 
 */
package com.vsspl.vyapar.report.response;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author SANTOSH
 *
 */
@Data
@NoArgsConstructor
public class SaleReportResponse {
	private List<SaleResponse> sale;
	private List<Expense> expense;
}
