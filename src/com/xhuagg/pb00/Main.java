package com.xhuagg.pb00;

public class Main {
	
	public static void main(String[] args) {
		
		int n = 10;
		
		int count = 0;
		while(n != 0) {
			count++;
			n = (n-1) & n;
		}
		
		System.out.println(count);
		
		
	}

}
