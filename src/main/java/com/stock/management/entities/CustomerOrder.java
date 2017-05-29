package com.stock.management.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CustomerOrder implements Serializable{

	@Id
	@GeneratedValue
	private Long idCustomerOrder;
	private String name;
	
	public CustomerOrder() {
		super();
	}

	public CustomerOrder(Long idCustomerOrder, String name) {
		super();
		this.idCustomerOrder = idCustomerOrder;
		this.name = name;
	}

	public Long getIdCustomerOrder() {
		return idCustomerOrder;
	}

	public void setIdCustomerOrder(Long idCustomerOrder) {
		this.idCustomerOrder = idCustomerOrder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
