package com.stock.management.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class StockMovement implements Serializable{

	public static final int INPUT = 1;
	
	public static final int OUTPUT = 2;
	
	@Id
	@GeneratedValue
	private Long idStockMovement;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMovement;
	
	private BigDecimal quantity;
	
	private Integer typeMovement;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article ;
	
	public StockMovement() {
		super();
	}

	public Long getIdStockMovement() {
		return idStockMovement;
	}

	public void setIdStockMovement(Long idStockMovement) {
		this.idStockMovement = idStockMovement;
	}

	public Date getDateMovement() {
		return dateMovement;
	}

	public void setDateMovement(Date dateMovement) {
		this.dateMovement = dateMovement;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public Integer getTypeMovement() {
		return typeMovement;
	}

	public void setTypeMovement(Integer typeMovement) {
		this.typeMovement = typeMovement;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

}
