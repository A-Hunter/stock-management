package com.stock.management.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sale implements Serializable{

	@Id
	@GeneratedValue
	private Long idSale;
	private String name;

	public Sale() {
		super();
	}

	public Sale(Long idSale, String name) {
		super();
		this.idSale = idSale;
		this.name = name;
	}

	public Long getIdSale() {
		return idSale;
	}

	public void setIdSale(Long idSale) {
		this.idSale = idSale;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
