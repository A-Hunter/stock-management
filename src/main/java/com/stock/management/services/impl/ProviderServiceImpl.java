package com.stock.management.services.impl;

import java.util.List;

import com.stock.management.dao.ProviderDAO;
import com.stock.management.entities.Provider;
import com.stock.management.services.ProviderService;

public class ProviderServiceImpl implements ProviderService{

private ProviderDAO dao;
	
	// For Spring , for the dependency injection
	public void setDao(ProviderDAO dao) {
		this.dao = dao;
	}

	@Override
	public Provider save(Provider provider) {
		return dao.save(provider);
	}

	@Override
	public Provider update(Provider provider) {
		return dao.update(provider);
	}

	@Override
	public List<Provider> loadAll() {
		return dao.loadAll();
	}

	@Override
	public List<Provider> loadAll(String sortField, String sort) {
		return dao.loadAll(sortField, sort);
	}

	@Override
	public Provider getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public Provider findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Provider findOne(String[] paramNames, Object[] paramValues) {
		return findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
}
