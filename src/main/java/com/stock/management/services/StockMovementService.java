package com.stock.management.services;

import java.util.List;

import com.stock.management.entities.StockMovement;

public interface StockMovementService {

	public StockMovement save(StockMovement entity);
	
	public StockMovement update(StockMovement entity);
	
	public List<StockMovement> loadAll();
	
	public List<StockMovement> loadAll(String sortField, String sort);
	
	public StockMovement getById(Long id);
	
	public void delete(Long id);
	
	public StockMovement findOne(String paramName, Object paramValue);
	
	public StockMovement findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
}
