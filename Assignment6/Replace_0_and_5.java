package Assignment_6;
import java.util.Scanner;
public class Replace_0_and_5 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		if (n == 0) {
			System.out.println(5);
			return;
		}
		replace(n, 0, 0);
	}

	public static void replace(int n, int ans, int i) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		if (n < 0) {
			return;
		}

		int rem = n % 10;
		if (rem == 0) {
			rem = 5;
		}
		int b = (int) (ans + rem * (Math.pow(10, i)));
		replace(n / 10, b, i + 1);

	}

}
