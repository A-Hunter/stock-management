package com.stock.management.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Provider implements Serializable{

	@Id
	@GeneratedValue
	private Long idProvider;
	private String name;
	
	public Provider() {
		super();
	}

	public Provider(Long idProvider, String name) {
		super();
		this.idProvider = idProvider;
		this.name = name;
	}

	public Long getIdProvider() {
		return idProvider;
	}

	public void setIdProvider(Long idProvider) {
		this.idProvider = idProvider;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
