package Assignment_2;

import java.util.*;

public class sum_odd_even {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int oddSum = 0;
		int evenSum = 0;
		int count = 0;
		while (n > 0) {
			int rem = n % 10;
			count++;
			if (count % 2 != 0 || count < 2) {
				oddSum += rem;
			} else {
				evenSum += rem;
			}
			n /= 10;
		}
		System.out.println(oddSum);
		System.out.println(evenSum);

	}

}