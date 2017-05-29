package com.stock.management.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Sale implements Serializable{

	@Id
	@GeneratedValue
	private Long idSale;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date saleDate;
	
	@OneToMany(mappedBy="sale")
	private List<SaleLine> saleLines;

	public Sale() {
		super();
	}

	public Long getIdSale() {
		return idSale;
	}

	public void setIdSale(Long idSale) {
		this.idSale = idSale;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public List<SaleLine> getSaleLines() {
		return saleLines;
	}

	public void setSaleLines(List<SaleLine> saleLines) {
		this.saleLines = saleLines;
	}
	
}
