package com.stock.management.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.stock.management.dao.impl.FlickrDAOImpl;

public class Test {

	public static void main(String[] args) {

		FlickrDAOImpl flickr = new FlickrDAOImpl();
		//flickr.auth();
		
		try{
			InputStream stream = new FileInputStream(new File("E:\\workspace-sts\\StockManagement\\src\\test\\resources\\pictures\\06VxcgE.jpg"));
			String url = flickr.savePicture(stream, "Netero_Isaac");
			System.out.println("The url of the uploaded picture is : " + url);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
