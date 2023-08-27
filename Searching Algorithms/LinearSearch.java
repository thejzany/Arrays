package com.jsp.arrays;

public class LinearSearch {
	
	public static int linearSearch(int arr[], int key){
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,18,2,28,20,8};
		int key = 18;
		if(linearSearch(arr, key)==-1) {
			System.out.println("Element not found");
		}else {
			System.out.println(key + " is present at index "+ linearSearch(arr, key));
		}
	}

}