package com.stock.management.services;

import java.io.InputStream;

public interface FlickrService {

	public String savePicture(InputStream picture, String title) throws Exception;

}
