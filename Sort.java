package com.test.java;

public class Sort {

	private void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				int temp;

				if (arr[i] > arr[j]) {

					temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;
				}
			}
		}

		System.out.println("Bubble sort : ");

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
	}

	private void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			int min = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[min] > arr[j]) {

					min = j;
				}
			}

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;

		}

		System.out.println("Selection sort : ");

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
	}

	public void insertionSort(int[] arr) {

		for (int i=1; i<arr.length; i++) { // Insertion sort starts from second element.
			
			int key = arr[i];
			
			int j = i - 1;
			
			while ((j > -1) && (arr[j] > key)) {
				
				arr[j + 1] = arr[j];
				
				j--;
			}
			
			arr[j + 1] = key;
		}
		
		System.out.println("Insertion sort : ");

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		Sort sort = new Sort();

		int[] arr = new int[] { 3, 2, 4, 65, 21, 54, 452, 78, 98, 34 };
		sort.bubbleSort(arr);
		System.out.println();

		arr = new int[] { 3, 2, 4, 65, 21, 54, 452, 78, 98, 34 };
		sort.selectionSort(arr);
		System.out.println();

		arr = new int[] { 3, 2, 4, 65, 21, 54, 452, 78, 98, 34 };
		sort.insertionSort(arr);
		System.out.println();
	}
}
