package com.stock.management.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Provider implements Serializable{

	@Id
	@GeneratedValue
	private Long idProvider;

	private String lastName;
	
	private String firstName;
	
	private String address;
	
	private String email;
	
	private String picture;
	
	@OneToMany(mappedBy="provider")
	private List<ProviderOrder> orders;
	
	public Provider() {
		super();
	}

	public Long getIdProvider() {
		return idProvider;
	}

	public void setIdProvider(Long idProvider) {
		this.idProvider = idProvider;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public List<ProviderOrder> getOrders() {
		return orders;
	}

	public void setOrders(List<ProviderOrder> orders) {
		this.orders = orders;
	}

	
}
