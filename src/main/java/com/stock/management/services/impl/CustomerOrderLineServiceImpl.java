package com.stock.management.services.impl;

import java.util.List;

import com.stock.management.dao.CustomerOrderLineDAO;
import com.stock.management.entities.CustomerOrderLine;
import com.stock.management.services.CustomerOrderLineService;

public class CustomerOrderLineServiceImpl implements CustomerOrderLineService{

private CustomerOrderLineDAO dao;
	
	// For Spring , for the dependency injection
	public void setDao(CustomerOrderLineDAO dao) {
		this.dao = dao;
	}

	@Override
	public CustomerOrderLine save(CustomerOrderLine customerOrderLine) {
		return dao.save(customerOrderLine);
	}

	@Override
	public CustomerOrderLine update(CustomerOrderLine customerOrderLine) {
		return dao.update(customerOrderLine);
	}

	@Override
	public List<CustomerOrderLine> loadAll() {
		return dao.loadAll();
	}

	@Override
	public List<CustomerOrderLine> loadAll(String sortField, String sort) {
		return dao.loadAll(sortField, sort);
	}

	@Override
	public CustomerOrderLine getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public CustomerOrderLine findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public CustomerOrderLine findOne(String[] paramNames, Object[] paramValues) {
		return findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
}
