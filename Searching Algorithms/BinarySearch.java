package com.jsp.arrays;

public class BinarySearch {
	
public static void binarySearch(int arr[],int key) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key) {
				System.out.println(key + " is present at index "+ mid);
				break;
			}else if(arr[mid]>key){
				high=mid-1;
			}else if(arr[mid]<key) {
				low=mid+1;
			}  
			if(low>high) {
				System.out.println("Element not found");
			}
		}		
}
	
	public static void main(String[] args) {
		int arr[] = {1,2,8,18,20,28};
		int element =18;
		binarySearch(arr, element);
	}
}