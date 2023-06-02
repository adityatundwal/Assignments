package Assignment_3;

import java.util.Scanner;
import java.util.Arrays;

public class Max_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			
			int n = sc.nextInt();
			int []arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			System.out.println(sum(arr));
		}
		
		

	}

	private static int sum(int[] arr) {
		
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			ans = Math.max(ans, sum);
			if(sum<0) {
				sum = 0;
			}
		}
		return ans;
		
	}
	
	

}
