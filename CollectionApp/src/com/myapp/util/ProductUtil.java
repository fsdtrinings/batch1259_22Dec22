package com.myapp.util;

import java.util.Random;

public class ProductUtil {

	public static int getRandomID()
	{
		Random random = new Random();
		
		int id = random.nextInt(5000);
		return id;
	}
}
