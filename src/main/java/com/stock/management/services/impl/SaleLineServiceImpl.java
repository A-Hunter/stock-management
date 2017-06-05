package com.stock.management.services.impl;

import java.util.List;

import com.stock.management.dao.SaleLineDAO;
import com.stock.management.entities.SaleLine;
import com.stock.management.services.SaleLineService;

public class SaleLineServiceImpl implements SaleLineService{


private SaleLineDAO dao;
	
	// For Spring , for the dependency injection
	public void setDao(SaleLineDAO dao) {
		this.dao = dao;
	}

	@Override
	public SaleLine save(SaleLine saleLine) {
		return dao.save(saleLine);
	}

	@Override
	public SaleLine update(SaleLine saleLine) {
		return dao.update(saleLine);
	}

	@Override
	public List<SaleLine> loadAll() {
		return dao.loadAll();
	}

	@Override
	public List<SaleLine> loadAll(String sortField, String sort) {
		return dao.loadAll(sortField, sort);
	}

	@Override
	public SaleLine getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public SaleLine findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public SaleLine findOne(String[] paramNames, Object[] paramValues) {
		return findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
}
