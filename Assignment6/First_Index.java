package Assignment_6;

import java.util.Scanner;

public class First_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int []arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		System.out.println(fi(arr,M));

	}

	private static int fi(int[] arr, int m) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==m) {
				return i;
			}
		}
		return -1;
	}

}
