package Assignment_3;

import java.util.Scanner;

public class Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println(majority(arr));

	}

	private static int majority(int[] arr) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]== arr[j]) {
					count++;
				}
			}
			if(count>arr.length/2) {
				return arr[i];
			}
			
		}
		return 0;
		
	}
	
	

}
