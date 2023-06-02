package Assignment_2;

import java.util.Scanner;


public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();				//36
		int n1 = sc.nextInt();
		int a = n;
		int b = n1;							//60
		
		while(n%n1!=0) {
			
			int rem = n%n1;
			n = n1;
			n1 = rem;
		}
		int lcm = (a*b)/n1;		
		System.out.println(lcm);

	}

}
