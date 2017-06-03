package com.stock.management.services;

import java.util.List;

import com.stock.management.entities.Article;

public interface ArticleService {

	public Article save(Article entity);
	
	public Article update(Article entity);
	
	public List<Article> loadAll();
	
	public List<Article> loadAll(String sortField, String sort);
	
	public Article getById(Long id);
	
	public void delete(Long id);
	
	public Article findOne(String paramName, Object paramValue);
	
	public Article findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
}
