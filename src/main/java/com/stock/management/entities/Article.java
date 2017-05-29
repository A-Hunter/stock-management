package com.stock.management.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="article")
public class Article implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idArticle;
	
	private String articleCode;
	
	private String description;
	
	private BigDecimal 	unitPriceExceptAVT;
	
	private BigDecimal AVT;
	
	private BigDecimal unitTotalPrice;
	
	private String photo;
	
	@ManyToOne
	@JoinColumn(name="idCategory")
	private Category category;

	public Article() {
		super();
	}

	public Long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}

	public String getArticleCode() {
		return articleCode;
	}

	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getUnitPriceExceptAVT() {
		return unitPriceExceptAVT;
	}

	public void setUnitPriceExceptAVT(BigDecimal unitPriceExceptAVT) {
		this.unitPriceExceptAVT = unitPriceExceptAVT;
	}

	public BigDecimal getAVT() {
		return AVT;
	}

	public void setAVT(BigDecimal aVT) {
		AVT = aVT;
	}

	public BigDecimal getUnitTotalPrice() {
		return unitTotalPrice;
	}

	public void setUnitTotalPrice(BigDecimal unitTotalPrice) {
		this.unitTotalPrice = unitTotalPrice;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
}
