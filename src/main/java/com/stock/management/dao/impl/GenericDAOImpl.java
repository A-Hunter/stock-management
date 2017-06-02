package com.stock.management.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
		Query query = entityManager.createQuery("select t from "+ type.getSimpleName() + " t");
		return query.getResultList();
	}

	@Override
	public List<E> loadAll(String sortField, String sort) {
		Query query = entityManager.createQuery("select t from "+ type.getSimpleName() + 
				" t order by " + sortField + " " + sort);
		return query.getResultList();
	}

	@Override
	public E getById(Long id) {
		
		return entityManager.find(type, id);
	}

	@Override
	public void delete(Long id) {
		E tab = entityManager.getReference(type, id);
		entityManager.remove(tab);
	}

	@Override
	public E findOne(String paramName, Object paramValue) {
		Query query = entityManager.createQuery("select t from "+ type.getSimpleName() + " t "+
				"where "+ paramName +" =:x");
		query.setParameter(paramName, paramValue);
		return query.getResultList().size()> 0 ? (E)query.getResultList().get(0) : null;
	}

	@Override
	public E findOne(String[] paramNames, Object[] paramValues) {
		if(paramNames.length != paramValues.length){
			return null;
		}
		String queryString = "select * from "+type.getSimpleName()+ " e where ";
		int len = paramNames.length;
		for(int i =0; i < len; i++){
			queryString += " e." + paramNames[i] + "= :x"+i;
			if((i+1) < len){
				queryString += " and ";
			}
		}
		Query query = entityManager.createQuery(queryString);
		for(int i=0; i < paramValues.length; i++){
			query.setParameter("x"+ i, paramValues[i]);
		}
		return query.getResultList().size()> 0 ? (E)query.getResultList().get(0) : null;

	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		Query query = entityManager.createQuery("select t from "+ type.getSimpleName() + " t "+
				"where "+ paramName +" =:x");
		query.setParameter(paramName, paramValue);
		return query.getResultList().size()> 0 ? ((Long)query.getSingleResult()).intValue() : 0;	
		}

}
