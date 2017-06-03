package com.stock.management.services;

import java.util.List;

import com.stock.management.entities.CustomerOrder;

public interface CustomerOrderService {

	public CustomerOrder save(CustomerOrder entity);
	
	public CustomerOrder update(CustomerOrder entity);
	
	public List<CustomerOrder> loadAll();
	
	public List<CustomerOrder> loadAll(String sortField, String sort);
	
	public CustomerOrder getById(Long id);
	
	public void delete(Long id);
	
	public CustomerOrder findOne(String paramName, Object paramValue);
	
	public CustomerOrder findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
}
