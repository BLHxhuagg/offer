package com.xhuagg.sort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	
	private static Random random = new Random();
	
	public static void main(String[] args) {
		int a[] = new int[] {5, 8, 8, 11, 6, 9};
//		int index = partition(a, 0, a.length-1);
//		System.out.println("a[" + index + "]=" + a[index]);
//		System.out.println(Arrays.toString(a));
		
		for(int i = 0; i < 1000000; i++) {
			a = TestUtil.getRandomArray();
//			System.out.println(Arrays.toString(a));
			quickSort(a);
//			System.out.println(Arrays.toString(a));
			if(TestUtil.checkOrder(a) == false) {
				System.out.println("ERROR");
				System.out.println(Arrays.toString(a));
			}
		}
	}
	
	public static void sort(int[] a) {
		
	}
	
	private static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	//���� [start, end]֮���һ�������
	public static int randomRange(int start, int end) {
		return random.nextInt(end - start + 1) + start;
	}
	
	//������a��[start, end]֮�������������һ��֧�㣬������ʹ��֧����߱�֧��ֵС��֧���ұ߱�֧��ֵ�󣬷���֧������
	public static int partition(int[] a, int start, int end) {
		if(a == null || start < 0 || end >= a.length)
			throw new RuntimeException("invalid parameters");
		
		int index = randomRange(start, end);
		swap(a, index, end);
		index = end;
		
		int i = 0, j = end-1;
		while(i < j) {
			//��߿���ȡ�ȣ��ұ߲���ȡ��
			while(i < j && a[i] <= a[end])
				i++;
			while(i < j && a[j] > a[end])
				j--;
			if(i < j)
				swap(a, i, j);
		}
		if(a[i] > a[end]) {
			swap(a, i, end);
			return i;
		} else
			return end;
	}
	
	public static void quickSort(int[] a) {
		quickSort0(a, 0, a.length-1);
	}
	private static void quickSort0(int[] a, int start, int end) {
		if(start == end)
			return;
		
		int index = partition(a, start, end);
		if(index > start)
			quickSort0(a, start, index-1);
		if(index < end)
			quickSort0(a, index+1, end);
	}

}
