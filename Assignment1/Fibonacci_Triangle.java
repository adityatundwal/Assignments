package Assignment_1;
import java.util.Scanner;

public class Fibonacci_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star =1;
		while(row<=n) {
			int i = 1;
			int first = 1;
			int second = 0;
			
			while(i<=star) {
				int next = first+second;
				first = second;
				second = next;
				i++;
				System.out.print(next+" ");


			}

			star+=2;	
			row++;
			System.out.println();
			
		}
		
		
	}

}