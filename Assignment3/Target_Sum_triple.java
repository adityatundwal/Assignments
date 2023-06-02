package Assignment_3;
import java.util.Scanner;
import java.util.Arrays;
public class Target_Sum_triple {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		
		int target = sc.nextInt();
		TargetSum2(arr,target);
	
	}
	
	public static void TargetSum2(int []arr, int target) {
		Arrays.sort(arr);
		for (int k = 0; k < arr.length; k++) {
			int i = k+1;
			int j = arr.length-1;
			int t = target - arr[k];
			while(i<j) {
				if(arr[i]+arr[j]>t) {
					j--;
				}
				else if (arr[i]+arr[j]<t) {
					i++;
				}
				else {
					System.out.println(arr[k]+", " + arr[i]+" and "+arr[j]);
					i++;
					j--;
				}
			}
		}
	}
	
/*	public static void TargetSum(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(Math.min(arr[i], arr[j])+"And "+Math.max(arr[i], arr[j]));
				}
			}
		}
	}*/

}
