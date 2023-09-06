package com.jsp.arrays;

public class BubbleSort {
	
	public static int[] bubbleSort(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}		
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,20,18,28,2,8};
		int res[] = bubbleSort(arr);
		for(int i =0; i<res.length; i++) {
			System.out.print(res[i] + " ");
		}

	}
}
