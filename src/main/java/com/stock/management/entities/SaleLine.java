package com.stock.management.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SaleLine implements Serializable{

	@Id
	@GeneratedValue
	private Long idSaleLine;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name="idSale")
	private Sale sale;

	public SaleLine() {
		super();
	}

	public Long getIdSaleLine() {
		return idSaleLine;
	}

	public void setIdSaleLine(Long idSaleLine) {
		this.idSaleLine = idSaleLine;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
}
