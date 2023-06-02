package Assignment_2;

import java.util.Scanner;

public class count_of_digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int count  = 0;
		
		while(n>0) {
			int rem = n%10;
			if(rem == d) {
				count++;
			}
			n/=10;
		}
		System.out.println(count);
	}
}
