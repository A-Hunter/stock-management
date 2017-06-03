package com.stock.management.services;

import java.util.List;

import com.stock.management.entities.ProviderOrder;

public interface ProviderOrderService {

	public ProviderOrder save(ProviderOrder entity);
	
	public ProviderOrder update(ProviderOrder entity);
	
	public List<ProviderOrder> loadAll();
	
	public List<ProviderOrder> loadAll(String sortField, String sort);
	
	public ProviderOrder getById(Long id);
	
	public void delete(Long id);
	
	public ProviderOrder findOne(String paramName, Object paramValue);
	
	public ProviderOrder findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
}
