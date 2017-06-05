package com.stock.management.services.impl;

import java.util.List;

import com.stock.management.dao.CategoryDAO;
import com.stock.management.entities.Category;
import com.stock.management.services.CategoryService;

public class CategoryServiceImpl implements CategoryService{
	
	private CategoryDAO dao;
	
	// For Spring , for the dependency injection
	public void setDao(CategoryDAO dao) {
		this.dao = dao;
	}

	@Override
	public Category save(Category category) {
		return dao.save(category);
	}

	@Override
	public Category update(Category category) {
		return dao.update(category);
	}

	@Override
	public List<Category> loadAll() {
		return dao.loadAll();
	}

	@Override
	public List<Category> loadAll(String sortField, String sort) {
		return dao.loadAll(sortField, sort);
	}

	@Override
	public Category getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public Category findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Category findOne(String[] paramNames, Object[] paramValues) {
		return findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
}
