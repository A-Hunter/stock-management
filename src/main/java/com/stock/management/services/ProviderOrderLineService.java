package com.stock.management.services;

import java.util.List;

import com.stock.management.entities.ProviderOrderLine;

public interface ProviderOrderLineService {

	public ProviderOrderLine save(ProviderOrderLine entity);
	
	public ProviderOrderLine update(ProviderOrderLine entity);
	
	public List<ProviderOrderLine> loadAll();
	
	public List<ProviderOrderLine> loadAll(String sortField, String sort);
	
	public ProviderOrderLine getById(Long id);
	
	public void delete(Long id);
	
	public ProviderOrderLine findOne(String paramName, Object paramValue);
	
	public ProviderOrderLine findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
}
