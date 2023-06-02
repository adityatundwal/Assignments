package Assignment_2;

import java.util.Scanner;

public class print_series {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			int num = 0;

			for (int i = 1; i <= n; i++) {
				num = 3 * i + 2;
				if (num % m != 0) {
					System.out.println(num);
				}else {
					n++;
				}
			}
		}

}
