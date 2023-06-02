package Assignment_3;
import java.util.*;

public class Target_Sum {
	


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
		int i = 0;
		int j = arr.length-1;
		while(i<j) {
			if(arr[i]+arr[j]>target) {
				j--;
			}
			else if(arr[i]+arr[j]<target) {
				i++;
			}
			else {
				System.out.println(arr[i]+" and "+arr[j]);
				i++;
				j--;
			}
		}
	}

}
