package com.test.java;

import java.util.Arrays;

public class Search {
	
	public int linearSearch(int[] arr, int number) {
		
		for (int i=0; i<arr.length; i++) {
			
			if (number == arr[i]) {
				
				return i;
			}
		}
		
		return -1;
	}
	
	public int binarySearch(int[] arr, int number) {
		
		int front = 0;
		
		int back = arr.length - 1;
		
		while (front <= back) {
			
			int mid = (front + back) / 2;
			
			if (number > arr[mid]) {
				
				front = mid + 1;
			}
			
			if (number < arr[mid]) {
				
				back = mid - 1;
			}
			
			if (number == arr[mid]) {
				
				System.out.println("Index : " + mid);
				return mid;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {2, 3, 4, 65, 21, 54, 452, 78, 98, 34};
		
		Search search = new Search();
		
		int index = search.linearSearch(arr, 34);
		
		System.out.println("Index : " + index);
		
		Arrays.sort(arr);
		int i = search.binarySearch(arr, 78);
		
		if (i == -1) {
			
			System.out.println("Not found");
		}
	}
}
