package Assignment_6;

import java.util.Scanner;

public class last_index_submission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		System.out.println(indice(arr,m));		
	}

	private static int indice(int[] arr, int m) {
		int index = 0;
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==m) {
				index = i;
			}
		}
		return index;
		}

}
