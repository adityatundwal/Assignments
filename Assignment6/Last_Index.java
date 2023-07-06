package Assignment_6;

import java.util.Scanner;

public class Last_Index {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int []arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		System.out.println(li(arr,M));

	}

	private static int li(int[] arr, int m) {
		// TODO Auto-generated method stub
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==m) {
				index = i;
			}
			
		}
		
		return index;
	}

}
