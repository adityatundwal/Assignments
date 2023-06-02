package Assignment_1;
import java.util.Scanner;

public class Double_Sided_Arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int space = n - 1;
		int num = 1;
		int space2 = -1;

		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			int j = 1;
			int value = num;
			while (j <= num) {
				System.out.print(value + " ");
				value--;
				j++;
			}

			int k = 1;
			while (k <= space2) {
				System.out.print("  ");
				k++;
			}

			int l = 1;
			if (row == 1 || row == n) {
				l = 2;
			}
			int value2 = 1;
			while (l <= num) {
				System.out.print(value2 + " ");
				value2++;
				l++;
			}

			if (row <= n / 2) {
				num++;
				space -= 2;
				space2 += 2;
			} else {
				num--;
				space += 2;
				space2 -= 2;
			}

			row++;
			System.out.println();
		}
		
	}

	
}
