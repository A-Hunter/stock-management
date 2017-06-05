package com.stock.management.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.management.dao.ArticleDAO;
import com.stock.management.entities.Article;
import com.stock.management.services.ArticleService;

@Transactional
public class ArticleServiceImpl implements ArticleService{
	
	private ArticleDAO dao;
	
	// For Spring , for the dependency injection
	public void setDao(ArticleDAO dao) {
		this.dao = dao;
	}

	@Override
	public Article save(Article article) {
		return dao.save(article);
	}

	@Override
	public Article update(Article article) {
		return dao.update(article);
	}

	@Override
	public List<Article> loadAll() {
		return dao.loadAll();
	}

	@Override
	public List<Article> loadAll(String sortField, String sort) {
		return dao.loadAll(sortField, sort);
	}

	@Override
	public Article getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public Article findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Article findOne(String[] paramNames, Object[] paramValues) {
		return findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
