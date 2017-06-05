package com.stock.management.dao;

import java.io.InputStream;

public interface FlickrDAO {
	public String savePicture(InputStream picture, String title) throws Exception;

}
