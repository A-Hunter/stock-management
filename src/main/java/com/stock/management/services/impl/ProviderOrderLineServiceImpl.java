package com.stock.management.services.impl;

import java.util.List;

import com.stock.management.dao.ProviderOrderLineDAO;
import com.stock.management.entities.ProviderOrderLine;
import com.stock.management.services.ProviderOrderLineService;

public class ProviderOrderLineServiceImpl implements ProviderOrderLineService{

private ProviderOrderLineDAO dao;
	
	// For Spring , for the dependency injection
	public void setDao(ProviderOrderLineDAO dao) {
		this.dao = dao;
	}

	@Override
	public ProviderOrderLine save(ProviderOrderLine providerOrderLine) {
		return dao.save(providerOrderLine);
	}

	@Override
	public ProviderOrderLine update(ProviderOrderLine providerOrderLine) {
		return dao.update(providerOrderLine);
	}

	@Override
	public List<ProviderOrderLine> loadAll() {
		return dao.loadAll();
	}

	@Override
	public List<ProviderOrderLine> loadAll(String sortField, String sort) {
		return dao.loadAll(sortField, sort);
	}

	@Override
	public ProviderOrderLine getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public ProviderOrderLine findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public ProviderOrderLine findOne(String[] paramNames, Object[] paramValues) {
		return findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
}
