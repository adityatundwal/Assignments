package Assignment_6;

import java.util.Scanner;
import java.util.ArrayList;;

public class All_Indices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		indice(arr,0,m);
	}

	private static void indice(int[] arr,int i, int m) {
		
		
		if(i==arr.length) {
			return;
		}
		if(arr[i]==m) {
			System.out.print(i+" ");
		}
		
		indice(arr,i+1, m);
	}

	
	

	

}
