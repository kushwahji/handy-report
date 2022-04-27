/**
 * 
 */
package com.vsspl.vyapar.report.response;

import java.math.BigDecimal;

import com.vsspl.vyapar.report.entity.Items;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author SANTOSH
 *
 */
@Data
@NoArgsConstructor
public class ItemsResponse {
	public ItemsResponse(Items i) {
		this.name = i.getName();
		this.quantity = i.getQuantity();
		this.price = i.getPrice();
	}
	private String name;
	private int quantity;
	private BigDecimal price;

}
