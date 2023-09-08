package com.jsp.arrays;

public class SumOfElements {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 8, 18, 20, 28 };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);

	}

}