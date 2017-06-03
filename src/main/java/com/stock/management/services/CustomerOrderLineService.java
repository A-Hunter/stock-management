package com.stock.management.services;

import java.util.List;

import com.stock.management.entities.CustomerOrderLine;

public interface CustomerOrderLineService {

	public CustomerOrderLine save(CustomerOrderLine entity);
	
	public CustomerOrderLine update(CustomerOrderLine entity);
	
	public List<CustomerOrderLine> loadAll();
	
	public List<CustomerOrderLine> loadAll(String sortField, String sort);
	
	public CustomerOrderLine getById(Long id);
	
	public void delete(Long id);
	
	public CustomerOrderLine findOne(String paramName, Object paramValue);
	
	public CustomerOrderLine findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
}
