package com.xhuagg.sort;

import java.util.Random;

public class TestUtil {
	
	private static Random random = new Random();
	
	public static int[] getRandomArray() {
		int len = random.nextInt(30);
		if(len < 0)
			len = -len;
		len += 3;
		
		int[] a = new int[len];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100);
		}
		
		return a;
	}
	
	public static boolean checkOrder(int[] a) {
		for(int i = 0; i < a.length-1; i++)
			if(a[i] > a[i+1])
				return false;
		return true;
	}

}
