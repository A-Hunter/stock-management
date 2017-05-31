package com.stock.management.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.stock.management.dao.GenericDAO;

@SuppressWarnings("unchecked")
public class GenericDAOImpl<E> implements GenericDAO<E>{

	@PersistenceContext
	EntityManager entityManager;
	
	private Class<E> type;
	
	public GenericDAOImpl() {
	
		Type type = getClass().getGenericSuperclass();
		ParameterizedType paramType = (ParameterizedType) type;
		type = (Class<E>)paramType.getActualTypeArguments()[0];
		
	}

	public Class<E> getType() {
		return type;
	}

	@Override
	public E save(E entity) {
		entityManager.persist(entity);
		return entity;
	}

	@Override
	public E update(E entity) {
		return entityManager.merge(entity);
	}

	@Override
	public List<E> loadAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> loadAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E findOne(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return 0;
	}

}
