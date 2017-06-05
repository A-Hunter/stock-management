package com.stock.management.services.impl;

import java.util.List;

import com.stock.management.dao.CustomerDAO;
import com.stock.management.entities.Customer;
import com.stock.management.services.CustomerService;

public class CustomerServiceImpl implements CustomerService{

	private CustomerDAO dao;
	
	// For Spring , for the dependency injection
	public void setDao(CustomerDAO dao) {
		this.dao = dao;
	}

	@Override
	public Customer save(Customer customer) {
		return dao.save(customer);
	}

	@Override
	public Customer update(Customer customer) {
		return dao.update(customer);
	}

	@Override
	public List<Customer> loadAll() {
		return dao.loadAll();
	}

	@Override
	public List<Customer> loadAll(String sortField, String sort) {
		return dao.loadAll(sortField, sort);
	}

	@Override
	public Customer getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public Customer findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Customer findOne(String[] paramNames, Object[] paramValues) {
		return findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
