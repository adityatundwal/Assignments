package Assignment_4;

import java.util.Scanner;

public class Squreroot_without_fn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(Square(n));;

	}

	private static int Square(int n) {
		// TODO Auto-generated method stub
		if(n<2) {
			return n;
		}
		
		int lo =1 ;
		int hi = n;
		
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(mid*mid==n) {
				return mid;
			}
			else if(mid*mid>n) {
				hi = mid-1;
			}else {
				lo = mid+1;
			}
		}
		
		return hi;
		
	}

}
