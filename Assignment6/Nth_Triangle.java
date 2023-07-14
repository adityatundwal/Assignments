package Assignment_6;

import java.util.Scanner;

public class Nth_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(fib(N));

	}

	private static int fib(int n) {
		if(n==0 || n==1) {
			return 0;
		}
		int c = n*(n+1)/2;
		
		return c;

	}

}
