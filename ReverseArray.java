package com.jsp.arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 8, 18, 20, 28 };

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}
}

