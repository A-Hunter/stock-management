package com.stock.management.services;

import java.util.List;

import com.stock.management.entities.User;

public interface UserService {

	public User save(User entity);
	
	public User update(User entity);
	
	public List<User> loadAll();
	
	public List<User> loadAll(String sortField, String sort);
	
	public User getById(Long id);
	
	public void delete(Long id);
	
	public User findOne(String paramName, Object paramValue);
	
	public User findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
}
