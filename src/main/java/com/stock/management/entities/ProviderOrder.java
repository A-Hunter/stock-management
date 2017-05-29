package com.stock.management.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProviderOrder implements Serializable{

	@Id
	@GeneratedValue
	private Long idProviderOrder;
	private String name;
	
	public ProviderOrder() {
		super();
	}

	public ProviderOrder(Long idProviderOrder, String name) {
		super();
		this.idProviderOrder = idProviderOrder;
		this.name = name;
	}

	public Long getIdProviderOrder() {
		return idProviderOrder;
	}

	public void setIdProviderOrder(Long idProviderOrder) {
		this.idProviderOrder = idProviderOrder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
