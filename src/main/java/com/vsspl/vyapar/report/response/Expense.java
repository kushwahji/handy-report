package com.vsspl.vyapar.report.response;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Expense {
	private BigDecimal price;
	private String comments;
}
