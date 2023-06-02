package Assignment_1;

import java.util.*;

public class Inverted_hourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int num = row;
		int space = 2 * n - 1;
		int num2 = n;

		while (row <= 2 * n + 1) {
			int i = 1;
			int value = n;
			while (i <= num) {
				System.out.print(value + " ");
				i++;
				value--;
			}

			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}

			int k = 1;
			int value2 = num2;
			if (row == n + 1) {
				k = 2;
				value2++;
			}
			while (k <= num) {
				System.out.print(value2 + " ");
				k++;
				value2++;
			}

			if (row <= n) {
				num++;
				space -= 2;
				num2--;
			} else {
				num--;
				space += 2;
				num2++;
			}

			row++;
			System.out.println();
		}
	}
}