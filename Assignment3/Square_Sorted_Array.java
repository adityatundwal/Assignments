package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Square_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sortedSquare(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static int[] sortedSquare(int[] arr) {		
		for (int i = 0; i < arr.length; i++) {
			arr[i]*=arr[i];
		}
		Arrays.sort(arr);
		return arr;
		
	}
	
	
	

}
