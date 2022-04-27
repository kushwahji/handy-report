/**
 * 
 */
package com.vsspl.vyapar.report.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name = "items")
@NoArgsConstructor
public class Items extends AuditModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;
	private int quantity;
	private BigDecimal price;

	public Items(Items i) {
		this.name = i.getName();
		this.quantity = i.getQuantity();
		this.price = new BigDecimal(i.getQuantity()).multiply(i.getPrice());
	}
}
