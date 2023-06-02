package Assignment_3;

import java.util.Scanner;

public class arrays_Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		System.out.println(Search(arr, M));

	}

	private static int Search(int[] arr, int M) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == M) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	
	

}
