package com.ms.product.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * @author Bharat2010
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String skuNo;
	private String label;
	private float price;

	public Product(String skuNo, String label, float price) {
		super();
		this.skuNo = skuNo;
		this.label = label;
		this.price = price;
	}
}
