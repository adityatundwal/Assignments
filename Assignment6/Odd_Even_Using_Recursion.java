package Assignment_6;

import java.util.Scanner;

public class Odd_Even_Using_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		OER(n);

	}

	private static void OER(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		if(n%2==1) {
			System.out.println(n);
		}
		OER(n-1);
		if(n%2==0) {
			System.out.println(n);
		}
		
		
	}

}
