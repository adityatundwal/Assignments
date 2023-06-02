package Assignment_2;
import java.util.Scanner;

public class reversing_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Print reverse 
		Take N as input, Calculate it's reverse also Print the reverse.
		Input Format
		Constraints
		0 <= N <= 1000000000

		Output Format
		Sample Input
		123456789
		Sample Output
		987654321
		Explanation
		You've to calculate the reverse in a number, not just print the reverse.*/
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		
		while(n!=0) {
			int rem = n%10;
			sum = sum*10+rem;
			n = n/10;
		}
		System.out.println(sum);



	}

}
