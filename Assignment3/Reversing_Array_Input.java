package Assignment_3;

import java.util.Scanner;

public class Reversing_Array_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Reverse(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}

	}
	
	public static void Reverse(int[] arr) {
		int i = 0;
		int j = arr.length-1;
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
