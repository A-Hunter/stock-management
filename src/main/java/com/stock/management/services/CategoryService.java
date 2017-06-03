package com.stock.management.services;

import java.util.List;

import com.stock.management.entities.Category;

public interface CategoryService {
	
	public Category save(Category entity);
	
	public Category update(Category entity);
	
	public List<Category> loadAll();
	
	public List<Category> loadAll(String sortField, String sort);
	
	public Category getById(Long id);
	
	public void delete(Long id);
	
	public Category findOne(String paramName, Object paramValue);
	
	public Category findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
