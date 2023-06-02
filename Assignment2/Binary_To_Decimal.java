package Assignment_2;
import java.util.Scanner;


public class Binary_To_Decimal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		btod(n);
	}
	
	public static void btod(int a) {
		
		int sum = 0;
		int mult = 1;
		
		while(a>0) {
			int rem = a%10;
			sum = sum+rem*mult;
			mult = mult*2;
			a = a/10;
			
		}
		System.out.println(sum);
	
	}
}
