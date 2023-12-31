package com.jsp.arrays;

public class InsertionSort {
	
	public static int[] insertionSort(int arr[]) {
		
		for(int i=1; i<arr.length; i++) {	
			int current=arr[i];
			int j=i-1;
			
			while(j>=0 && current<arr[j]) {
				arr[j+1] = arr[j];
				j--;
				}
			arr[j+1]=current;
			}
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,20,18,28,2,8};
		int res[] = insertionSort(arr);
		for(int i =0; i<res.length; i++) {
			System.out.print(res[i] + " ");
		}

	}
}