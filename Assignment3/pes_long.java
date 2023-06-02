package Assignment_3;

import java.util.Scanner;

public class pes_long {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long []arr = new long[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		long []ans =pes(arr, n);
		 for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}

	}
	
	
	public static long []pes(long[] arr, int n){
		long[] left = new long[arr.length];
		left[0] = 1;
		
		for (int i = 1; i < left.length; i++) {
			left[i] = left[i-1]*arr[i-1];
		}
		
		long []right = new long[arr.length];
		right[arr.length-1] = 1;
		for (int i = right.length-2; i>=0;i--) {
			right[i] = right[i+1]*arr[i+1];
		}
		
		for (int i = 0; i < right.length; i++) {
			arr[i] = left[i]*right[i];
		}
		
		return arr;
	}

}
