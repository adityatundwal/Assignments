package Assignment_2;
import java.util.Scanner;
public class Armstrong_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		for (int i = n; i <= m; i++) {
			int count = 0;
			int i2 = i;
			while (i2 > 0) {
				int rem = i2 % 10;
				count++;
				i2 /= 10;
			}

			int sum = 0;
			int i3 = i;
			while (i3 > 0) {
				int rem = i3 % 10;
				sum = (int) (sum + Math.pow(rem, count));
				i3 /= 10;
			}

			if (sum == i) {
				System.out.println(sum);
			}
		}
	}

}
