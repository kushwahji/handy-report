/**
 * 
 */
package com.vsspl.vyapar.report.response;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author SANTOSH
 *
 */
@Data
@NoArgsConstructor
public class Notification {
	private String message;
	private String detail;
}
