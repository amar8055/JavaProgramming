package com.jnit.oca2017.arrays;

import java.util.Arrays;

//equals -> compares references
//Arrays.equals -> content comparision
public class Main {

	public static void main(String[] args) {

		int[] b = { 1, 21, 9, 4,13,2,121,45 };
		int c[] = { 1, 2, 3, 4, 5 };
		int d[] = new int[5];// 0,1,2,3,4
		int e[] = new int[] { 0, 1, 2, 3, 4 };
		d[0] = 1;
		d[2] = 4;
		
		//d[10] = 10;
		System.out.println(b[3]);
		System.out.println(b);
		System.out.println(Arrays.toString(b));
	//	Arrays.sort(b);
		System.out.println("Printing the sorted array");
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.binarySearch(b, 2));
		System.out.println(Arrays.binarySearch(b,29));

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		for (int x : b) {
			System.out.println(x);
		}
		System.out.println(d.length);
		
		//2 dimensional array
		int[][] a2d = { { 1, 2, 3 }, { 3, 4 } };
		int[][] differentSize = { { 1, 4 }, { 3 }, { 9, 8, 7 } };
		int[] a2d1[] = { { 1, 2, 3 }, { 3, 4 } };
		int a2d2[][] = { { 1, 2, 3 }, { 3, 4 } };
		int a2d3[][] = {};
		int a2d4[][] = new int[2][3];
		int  twoDimensional[][] = new int[2][];
		twoDimensional[0] = new int[3];
		twoDimensional[1] = new int[2];
		
		System.out.println("Printing the 2 dimensional array values ");

		for (int i = 0; i < a2d.length; i++) {
			for (int j = 0; j < a2d[i].length; j++) {
				System.out.println(i + "" + j);
				System.out.println(a2d[i][j]);
			}
		}

		for (int i = 0; i < differentSize.length; i++) {
			for (int j = 0; j < differentSize[i].length; j++) {
				System.out.println(i + "" + j);
				System.out.println(differentSize[i][j]);
			}

			// 3d
			int[][][] a3d = { { { 1, 2, 3 }, { 3, 4 } } };
			Arrays.sort(a3d);
			System.out.println(Arrays.toString(a3d));
			int[] a3d1[][] = { { { 1, 2, 3 }, { 3, 4 } } };
			int a3d3[][][] = { { { 1, 2, 3 }, { 3, 4 } } };
			int a3d4[][][] = {};
			System.out.println("Printing 3 dimensional array");
			System.out.println(a3d[0][1][0]);
			int a3d5[][][] = new int[2][3][4];
			int a3d6[][][] = new int[2][][];
			int a3d7[][][] = new int[2][][];

		}

	}
}