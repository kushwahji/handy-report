/**
 * 
 */
package com.vsspl.vyapar.report.response;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import com.vsspl.vyapar.report.entity.Sale;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author SANTOSH
 *
 */
@Data
@NoArgsConstructor
public class SaleResponse {
	public SaleResponse(Sale sale) {
		this.saleId = sale.getSaleId();
		this.cname = sale.getCname();
		this.phone = sale.getPhone();
		this.totalPrice = sale.getTotalPrice();
		this.pstatus = sale.getPstatus();
		this.paidAmount = sale.getPaidAmount();
		this.saleDate = sale.getCreatedAt();
		this.items = sale.getItems().stream().map(i->new ItemsResponse(i)).collect(Collectors.toList());
	}

	private long saleId;
	private String cname;
	private String phone;
	private String pstatus;
	private BigDecimal paidAmount;
	private Date saleDate;
	private BigDecimal totalPrice;
	List<ItemsResponse> items;
}
