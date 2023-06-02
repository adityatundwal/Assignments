package Assignment_2;
import java.util.Scanner;


public class check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		/*Check prime
		 Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".
		 Input Format
		 Constraints
			2 < N <= 1000000000

		 Output Format
		 Sample Input
			3
		Sample Output
			Prime
		Explanation
		The output is case specific
		 */
		
		if (n%2!=0) {
			System.out.print("Prime");
		}
		else {
			System.out.print("Not Prime");
		}

	}

}
