package com.stock.management.services.impl;

import java.util.List;

import com.stock.management.dao.StockMovementDAO;
import com.stock.management.entities.StockMovement;
import com.stock.management.services.StockMovementService;

public class StockMovementServiceImpl implements StockMovementService{

private StockMovementDAO dao;
	
	// For Spring , for the dependency injection
	public void setDao(StockMovementDAO dao) {
		this.dao = dao;
	}

	@Override
	public StockMovement save(StockMovement stockMovement) {
		return dao.save(stockMovement);
	}

	@Override
	public StockMovement update(StockMovement stockMovement) {
		return dao.update(stockMovement);
	}

	@Override
	public List<StockMovement> loadAll() {
		return dao.loadAll();
	}

	@Override
	public List<StockMovement> loadAll(String sortField, String sort) {
		return dao.loadAll(sortField, sort);
	}

	@Override
	public StockMovement getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public StockMovement findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public StockMovement findOne(String[] paramNames, Object[] paramValues) {
		return findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
}
