package Assignment_3;

import java.util.Scanner;

public class product_except_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int []ans =pes(arr);
		 for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}

	}
	
	
	public static int []pes(int[] arr){
		int[] left = new int[arr.length];
		left[0] = 1;
		
		for (int i = 1; i < left.length; i++) {
			left[i] = left[i-1]*arr[i-1];
		}
		
		int []right = new int[arr.length];
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
