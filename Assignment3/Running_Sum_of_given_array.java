package Assignment_3;
import java.util.Scanner;

public class Running_Sum_of_given_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\

        
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		run(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static int[] run(int[] arr) {
		for (int i = 1; i < arr.length; ++i) {
			arr[i] += arr[i-1];
		}
		return arr;


	}

}
