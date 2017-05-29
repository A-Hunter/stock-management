package com.stock.management.entities;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer implements Serializable{

	@Id
	@GeneratedValue
	private Long idCustomer;
	private String name;
	
	public Customer() {
		super();
	}

	public Customer(Long idCustomer, String name) {
		super();
		this.idCustomer = idCustomer;
		this.name = name;
	}

	public Long getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
