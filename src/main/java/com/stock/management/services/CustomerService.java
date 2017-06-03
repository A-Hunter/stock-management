package com.stock.management.services;

import java.util.List;

import com.stock.management.entities.Customer;

public interface CustomerService {

	public Customer save(Customer entity);
	
	public Customer update(Customer entity);
	
	public List<Customer> loadAll();
	
	public List<Customer> loadAll(String sortField, String sort);
	
	public Customer getById(Long id);
	
	public void delete(Long id);
	
	public Customer findOne(String paramName, Object paramValue);
	
	public Customer findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
}
