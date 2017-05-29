package com.stock.management.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProviderOrderLine implements Serializable{

	@Id
	@GeneratedValue
	private Long idProviderOrderLine;
	private String name;

	public ProviderOrderLine() {
		super();
	}

	public ProviderOrderLine(Long idProviderOrderLine, String name) {
		super();
		this.idProviderOrderLine = idProviderOrderLine;
		this.name = name;
	}

	public Long getIdProviderOrderLine() {
		return idProviderOrderLine;
	}

	public void setIdProviderOrderLine(Long idProviderOrderLine) {
		this.idProviderOrderLine = idProviderOrderLine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
