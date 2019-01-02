package com.xhuagg.pb08;

public class RotateArray {
	
	public static void main(String[] args) {
		
		int a[] = {2, 2, 2, 2, 0, 1, 2};
		
		System.out.println(findMin(a));
		
	}
	
	//查找旋转数组中最小值
	public static Integer findMin(int[] a) {
		if(a == null || a.length == 0)
			return null;
	
		int low = 0;
		int high = a.length-1;
		int mid = 0;
		
		if(a[0] < a[high])
			return a[0];
		
		while(low < high-1) {
			mid = (low+high)/2;
			if(a[mid] > a[high]) {
				low = mid;
			} else if(a[mid] < a[high]) {
				high = mid;
			} else if(a[mid] == a[high] && a[mid] == a[low]){
				for(int i = low; i < high; i++) {
					if(a[i] > a[i+1])
						return a[i+1];
				}
			}
		}
		
		return a[high];
	}

}
