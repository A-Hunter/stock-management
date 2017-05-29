package com.stock.management.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StockMovement implements Serializable{

	@Id
	@GeneratedValue
	private Long idStockMovement;
	private String name;
	
	public StockMovement() {
		super();
	}

	public StockMovement(Long idProviderOrder, String name) {
		super();
		this.idStockMovement = idProviderOrder;
		this.name = name;
	}

	public Long getIdStockMovement() {
		return idStockMovement;
	}

	public void setIdStockMovement(Long idStockMovement) {
		this.idStockMovement = idStockMovement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
