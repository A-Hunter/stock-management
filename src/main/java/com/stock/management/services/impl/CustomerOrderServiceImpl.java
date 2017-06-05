package com.stock.management.services.impl;

import java.util.List;

import com.stock.management.dao.CustomerOrderDAO;
import com.stock.management.entities.CustomerOrder;
import com.stock.management.services.CustomerOrderService;

public class CustomerOrderServiceImpl implements CustomerOrderService{


	private CustomerOrderDAO dao;
	
	// For Spring , for the dependency injection
	public void setDao(CustomerOrderDAO dao) {
		this.dao = dao;
	}

	@Override
	public CustomerOrder save(CustomerOrder customerOrder) {
		return dao.save(customerOrder);
	}

	@Override
	public CustomerOrder update(CustomerOrder customerOrder) {
		return dao.update(customerOrder);
	}

	@Override
	public List<CustomerOrder> loadAll() {
		return dao.loadAll();
	}

	@Override
	public List<CustomerOrder> loadAll(String sortField, String sort) {
		return dao.loadAll(sortField, sort);
	}

	@Override
	public CustomerOrder getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public CustomerOrder findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public CustomerOrder findOne(String[] paramNames, Object[] paramValues) {
		return findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
