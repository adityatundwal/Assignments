package Assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class Rowwise_Sort_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		/*
		 * Scanner sc = new Scanner(System.in); int r = sc.nextInt(); int c =
		 * sc.nextInt(); int[][] arr = new int[r][c]; for (int i = 0; i < arr.length;
		 * i++) { for (int j = 0; j < arr.length; j++) { arr[i][j] = sc.nextInt(); } }
		 */
		
		int [][]arr = {{13,5,13,9,11},{5,10,11,4,6},{6,10,17,12,16},{8,11,7,18,5}};
		Rowwise(arr);

	}

	private static void Rowwise(int[][] arr) {
		// TODO Auto-generated method stub
		
		for (int r = 0; r < arr.length; r++) {
			Arrays.sort(arr);			
			}
		
		for (int i = 0; i < arr.length; i++) {
			
		}
		
	}

}
