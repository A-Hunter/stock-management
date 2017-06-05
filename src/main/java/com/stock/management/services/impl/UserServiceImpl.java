package com.stock.management.services.impl;

import java.util.List;

import com.stock.management.dao.UserDAO;
import com.stock.management.entities.User;
import com.stock.management.services.UserService;

public class UserServiceImpl implements UserService{


private UserDAO dao;
	
	// For Spring , for the dependency injection
	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

	@Override
	public User save(User user) {
		return dao.save(user);
	}

	@Override
	public User update(User user) {
		return dao.update(user);
	}

	@Override
	public List<User> loadAll() {
		return dao.loadAll();
	}

	@Override
	public List<User> loadAll(String sortField, String sort) {
		return dao.loadAll(sortField, sort);
	}

	@Override
	public User getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public User findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public User findOne(String[] paramNames, Object[] paramValues) {
		return findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
}
