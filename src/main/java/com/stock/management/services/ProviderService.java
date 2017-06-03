package com.stock.management.services;

import java.util.List;

import com.stock.management.entities.Provider;

public interface ProviderService {

	public Provider save(Provider entity);
	
	public Provider update(Provider entity);
	
	public List<Provider> loadAll();
	
	public List<Provider> loadAll(String sortField, String sort);
	
	public Provider getById(Long id);
	
	public void delete(Long id);
	
	public Provider findOne(String paramName, Object paramValue);
	
	public Provider findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
}
