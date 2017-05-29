package com.stock.management.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SaleLine implements Serializable{

	@Id
	@GeneratedValue
	private Long idSaleLine;
	private String name;

	public SaleLine() {
		super();
	}

	public SaleLine(Long idSaleLine, String name) {
		super();
		this.idSaleLine = idSaleLine;
		this.name = name;
	}

	public Long getIdSaleLine() {
		return idSaleLine;
	}

	public void setIdSaleLine(Long idSaleLine) {
		this.idSaleLine = idSaleLine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
