package com.stock.management.services.impl;

import java.util.List;

import com.stock.management.dao.SaleDAO;
import com.stock.management.entities.Sale;
import com.stock.management.services.SaleService;

public class SaleServiceImpl implements SaleService{


private SaleDAO dao;
	
	// For Spring , for the dependency injection
	public void setDao(SaleDAO dao) {
		this.dao = dao;
	}

	@Override
	public Sale save(Sale sale) {
		return dao.save(sale);
	}

	@Override
	public Sale update(Sale sale) {
		return dao.update(sale);
	}

	@Override
	public List<Sale> loadAll() {
		return dao.loadAll();
	}

	@Override
	public List<Sale> loadAll(String sortField, String sort) {
		return dao.loadAll(sortField, sort);
	}

	@Override
	public Sale getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public Sale findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Sale findOne(String[] paramNames, Object[] paramValues) {
		return findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
}
