package Assignment_6;
import java.util.*;
public class Split_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(split(arr,0,0,"",0,""));
		 

	}

	private static int split(int[] arr, int i, int sum, String ans, int sum1, String ans1) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			if(sum==sum1) {
				System.out.println(ans+" and "+ans1);
				return 1;
			}
			return 0;

		}
		int a = split(arr, i+1, sum+arr[i], ans+arr[i]+" ", sum1, ans1);
		int b = split(arr, i+1, sum, ans, sum1+arr[i], ans1+arr[i]+" ");
		return a+b;

	}

}
