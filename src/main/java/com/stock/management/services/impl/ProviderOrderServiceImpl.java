package com.stock.management.services.impl;

import java.util.List;

import com.stock.management.dao.ProviderOrderDAO;
import com.stock.management.entities.ProviderOrder;
import com.stock.management.services.ProviderOrderService;

public class ProviderOrderServiceImpl implements ProviderOrderService{


	private ProviderOrderDAO dao;
	
	// For Spring , for the dependency injection
	public void setDao(ProviderOrderDAO dao) {
		this.dao = dao;
	}

	@Override
	public ProviderOrder save(ProviderOrder providerOrder) {
		return dao.save(providerOrder);
	}

	@Override
	public ProviderOrder update(ProviderOrder providerOrder) {
		return dao.update(providerOrder);
	}

	@Override
	public List<ProviderOrder> loadAll() {
		return dao.loadAll();
	}

	@Override
	public List<ProviderOrder> loadAll(String sortField, String sort) {
		return dao.loadAll(sortField, sort);
	}

	@Override
	public ProviderOrder getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public ProviderOrder findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public ProviderOrder findOne(String[] paramNames, Object[] paramValues) {
		return findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
