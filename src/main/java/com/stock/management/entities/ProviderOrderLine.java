package com.stock.management.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ProviderOrderLine implements Serializable{

	@Id
	@GeneratedValue
	private Long idProviderOrderLine;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;

	@ManyToOne
	@JoinColumn(name="idProviderOrder")   
	private ProviderOrder providerOrder;
	
	public ProviderOrderLine() {
		super();
	}

	public Long getIdProviderOrderLine() {
		return idProviderOrderLine;
	}

	public void setIdProviderOrderLine(Long idProviderOrderLine) {
		this.idProviderOrderLine = idProviderOrderLine;
	}
 
	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public ProviderOrder getProviderOrder() {
		return providerOrder;
	}

	public void setProviderOrder(ProviderOrder providerOrder) {
		this.providerOrder = providerOrder;
	}
}
