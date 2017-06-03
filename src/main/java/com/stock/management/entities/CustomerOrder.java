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
public class CustomerOrder implements Serializable{

	@Id
	@GeneratedValue
	private Long idCustomerOrder;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDate;
	
	@ManyToOne
	@JoinColumn(name="idCustomer")
	private Customer customer;
	
	@OneToMany(mappedBy="customerOrder")
	private List<CustomerOrderLine> lines;
	
	public CustomerOrder() {
		super();
	}

	public Long getIdCustomerOrder() {
		return idCustomerOrder;
	}

	public void setIdCustomerOrder(Long idCustomerOrder) {
		this.idCustomerOrder = idCustomerOrder;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<CustomerOrderLine> getLines() {
		return lines;
	}

	public void setLines(List<CustomerOrderLine> lines) {
		this.lines = lines;
	}
	
}
