package com.stock.management.services;

import java.util.List;

import com.stock.management.entities.SaleLine;

public interface SaleLineService {

	public SaleLine save(SaleLine entity);
	
	public SaleLine update(SaleLine entity);
	
	public List<SaleLine> loadAll();
	
	public List<SaleLine> loadAll(String sortField, String sort);
	
	public SaleLine getById(Long id);
	
	public void delete(Long id);
	
	public SaleLine findOne(String paramName, Object paramValue);
	
	public SaleLine findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
}
