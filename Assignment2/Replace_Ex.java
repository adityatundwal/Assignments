package Assignment_2;
import java.util.Scanner;

public class Replace_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

	long sum = 0;
	long multi = 1;
	long m = n;
	while (n > 0) {

		int rem = (int) (n % 10);
		if (rem == 0) {
			sum = sum + 5 * multi;
		} else {

			sum = sum + rem * multi;
		}
		n = n / 10;
		multi = multi * 10;

	}
	if (m == 0) {
		System.out.println(5);
	}
	else {
		  System.out.println(sum);
	}
	
	
	  }

}
