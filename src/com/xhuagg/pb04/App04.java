package com.xhuagg.pb04;

public class App04 {
	
	
	public static void main(String[] args) {

		System.out.println(replaceSpace(null));
		System.out.println(replaceSpace(""));
		System.out.println(replaceSpace(" "));
		System.out.println(replaceSpace("    "));
		
		int[] a = new int[15];
		int[] b = new int[6];
		
		a[0] = 1;
		a[1] = 3;
		a[2] = 4;
		a[3] = 5;
		a[4] = 9;
		int sa = 5;
		
		b[0] = 2;
		b[1] = 3;
		b[2] = 6;
		int sb = 3;
		
		mergeArray(a, sa, b, sb);
		for(int i = 0; i < sa+sb; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		
		
		
		
	}
	
	
	/**
	 * 将连个有序数组合并到a中，并保留顺序
	 * @param a 一个有序数组有足够的长度容纳b
	 * @param b 一个有序数组
	 * @return 是否合并成功
	 * 1 3 4 4 9
	 * 2 3 6
	 * 1 2 3 3 4 4 6 9
	 */
	public static boolean mergeArray(int[] a, int sa, int[] b, int sb) {
		if(sa + sb > a.length)
			return false;
		
		int i = sa - 1;//指向a最大的
		int j = sb - 1;//指向b最大的
		int k = sa + sb - 1;
		
		while(j >= 0) {
			if(a[i] > b[j]) {
				a[k] = a[i];
				i--;
				k--;
			} else {
				a[k] = b[j];
				j--;
				k--;
			}
		}
		
		return true;
	}
	
	/**
	 * 替换空格，实现一个函数将字一个字符串的每个空格替换成%20
	 */
	public static String replaceSpace(String str) {
		if(str == null)
			return null;
		
		char[] s = str.toCharArray();
		char[] t = null;
		int spaceCount = 0;
		for(int i = 0; i < s.length; i++)
			if(s[i] == ' ')
				spaceCount++;
		t = new char[s.length + 2*spaceCount];
		
		for(int i = 0, j = 0; i < s.length; i++) {
			if(s[i] == ' ') {
				t[j++] = '%';
				t[j++] = '2';
				t[j++] = '0';
			} else {
				t[j++] = s[i];
			}
		}
		
		return new String(t);
	}

}
