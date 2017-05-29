package com.stock.management.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ProviderOrder implements Serializable{

	@Id
	@GeneratedValue
	private Long idProviderOrder;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDate;
	
	@ManyToOne
	@JoinColumn(name="idProvider")
	private Provider provider;
	
	@OneToMany(mappedBy="providerOrder")
	private List<ProviderOrderLine> lines;
	
	public ProviderOrder() {
		super();
	}

	public Long getIdProviderOrder() {
		return idProviderOrder;
	}

	public void setIdProviderOrder(Long idProviderOrder) {
		this.idProviderOrder = idProviderOrder;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public List<ProviderOrderLine> getLines() {
		return lines;
	}

	public void setLines(List<ProviderOrderLine> lines) {
		this.lines = lines;
	}

	
}
