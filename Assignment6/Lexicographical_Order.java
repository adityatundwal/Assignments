package Assignment_6;

import java.util.Scanner;

public class Lexicographical_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Lexi(0,n);
	}

	private static void Lexi(int curr, int n) {
		if(curr>n) {
			return;
		}
		System.out.print(curr+" ");
		int i = 0;
		if(curr==0) {
			i=1;
		}
		for (; i <= 9; i++) {
			Lexi(curr*10+i,n);
		}
	}

}
