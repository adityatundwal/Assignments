package Assignment_3;

import java.util.Scanner;

public class Quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sortColors(arr);
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i]);
			}
		}

	}

	private static void sortColors(int[] arr) {
		// TODO Auto-generated method stub
		
		
		
	}

}
