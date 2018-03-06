package com.jnit.oca2017.arrays;

import java.util.Arrays;

public class BinarySearchExample {

	public static void main(String[] args) {
		int[]a = {1,3,5,7};//{1,3,4,5,7}
		int[]b = {4,2,9,1};
		System.out.println(Arrays.binarySearch(a, 1));
		System.out.println(Arrays.binarySearch(a, 2));//-1-1 = -2
		System.out.println(Arrays.binarySearch(a, 4));//-2-1 = -3
		System.out.println(Arrays.binarySearch(a, 6));
		System.out.println(Arrays.binarySearch(b, 2));
		System.out.println(Arrays.binarySearch(b, 1));
	}

}
