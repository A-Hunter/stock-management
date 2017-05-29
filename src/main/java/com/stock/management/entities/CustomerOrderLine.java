package com.stock.management.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CustomerOrderLine implements Serializable{

	@Id
	@GeneratedValue
	private Long idCustomerOrderLine;
	private String name;

	public CustomerOrderLine() {
		super();
	}

	public CustomerOrderLine(Long idCustomerOrderLine, String name) {
		super();
		this.idCustomerOrderLine = idCustomerOrderLine;
		this.name = name;
	}

	public Long getIdCustomerOrderLine() {
		return idCustomerOrderLine;
	}

	public void setIdCustomerOrderLine(Long idCustomerOrderLine) {
		this.idCustomerOrderLine = idCustomerOrderLine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
