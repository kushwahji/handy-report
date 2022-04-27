/**
 * 
 */
package com.vsspl.vyapar.report.entity;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.vsspl.vyapar.report.request.SaleRequest;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author SANTOSH
 *
 */
@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name = "sale")
@NoArgsConstructor
public class Sale extends AuditModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long saleId;
	private String cname;
	private String phone;
	private String pstatus;	
	private String uemail;
	private BigDecimal paidAmount;
	private BigDecimal totalPrice;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "sale_fid", referencedColumnName = "saleId")
	List<Items> items;
	
	public Sale(SaleRequest request) {
		this.cname = request.getCname();
		this.phone = request.getPhone();
		this.pstatus = request.getPstatus();
		this.uemail = request.getUemail();
		this.paidAmount = request.getPaidAmount();
		this.items = request.getItems().stream().map(i-> new Items(i)).collect(Collectors.toList());
		this.totalPrice=totalPrice();
	}
	
	public BigDecimal totalPrice() {
		return items.stream().map(Items::getPrice).reduce(BigDecimal::add).get();
	}
}
