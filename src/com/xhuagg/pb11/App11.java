package com.xhuagg.pb11;

public class App11 {
	
	public static void main(String[] args) {
		
		System.out.println(pow(1.7321, 2));
		
	}
	
	public static double pow(double base, int exp) {
		int absExp = exp<0?-exp:exp;
		
		if(equal(base, 0)) {
			if(exp > 0)
				return 0.0;
			else
				throw new RuntimeException("base can not be 0 when exp is not positive");
		}
		
		double result = pow0(base, absExp);
		
		if(exp < 0)
			result = 1.0/result;
		
		return result;
	}
	
	//递归高效地做指数为正的指数运算
	private static double pow0(double base, int absExp) {
		if(absExp < 0)
			throw new RuntimeException("absExp can not be negative.");
		if(absExp == 0)
			return 1.0;
		double result = pow0(base, absExp>>1); //i.e. absExp /= 2
		if((absExp&0x1) != 0) {//i.e. absExp%2 == 1
			return result*result*base;
		} else {
			return result*result;
		}
	}
	
	public static boolean equal(double a, double b) {
		if((a-b) > -1e-10 && (a-b) < 1e-10)
			return true;
		return false;
	}

}
