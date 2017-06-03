package com.stock.management.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CustomerOrderLine implements Serializable{

	@Id
	@GeneratedValue
	private Long idCustomerOrderLine;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name="idCustomerOrder")
	private CustomerOrder customerOrder;

	public CustomerOrderLine() {
		super();
	}

	public Long getIdCustomerOrderLine() {
		return idCustomerOrderLine;
	}

	public void setIdCustomerOrderLine(Long idCustomerOrderLine) {
		this.idCustomerOrderLine = idCustomerOrderLine;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CustomerOrder getCustomerOrder() {
		return customerOrder;
	}

	public void setCustomerOrder(CustomerOrder customerOrder) {
		this.customerOrder = customerOrder;
	}

	
}
