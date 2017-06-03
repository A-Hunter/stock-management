package com.stock.management.services;

import java.util.List;

import com.stock.management.entities.Sale;

public interface SaleService {

	public Sale save(Sale entity);
	
	public Sale update(Sale entity);
	
	public List<Sale> loadAll();
	
	public List<Sale> loadAll(String sortField, String sort);
	
	public Sale getById(Long id);
	
	public void delete(Long id);
	
	public Sale findOne(String paramName, Object paramValue);
	
	public Sale findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
}
