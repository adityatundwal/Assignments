package Assignment_3;
import java.util.Scanner;
import java.lang.Math; 

public class Circular_Sumn {
	



	  public static void main(String[] args){
			// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t-->0) {
				int n = sc.nextInt();
				int []arr = new int[n];
				
				for (int i = 0; i < arr.length; i++) {
					arr[i] = sc.nextInt();
				}
			}

		}
		public static int circular_sum(int[] arr) {
			
			int linearmaxsum = Kadenes(arr);

	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    		//total sum
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum+=arr[i];
				arr[i]= arr[i]*-1;
			}
			
			int midpart = Kadenes(arr);
			sum +=midpart;
			return Math.max(linearmaxsum, sum);
			
			
		}
		
		public static int Kadenes(int[] arr) {
			int ans = Integer.MIN_VALUE;  //-2^31
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
