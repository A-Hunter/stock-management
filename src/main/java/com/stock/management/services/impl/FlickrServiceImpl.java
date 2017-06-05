package com.stock.management.services.impl;

import java.io.InputStream;

import com.stock.management.dao.FlickrDAO;
import com.stock.management.services.FlickrService;

public class FlickrServiceImpl implements FlickrService{

	private FlickrDAO dao;

	public void setDao(FlickrDAO dao) {
		this.dao = dao;
	}
	
	public String savePicture(InputStream picture, String title) throws Exception {
		
		return dao.savePicture(picture, title);
	}

}
