package Assignment_6;

import java.util.Scanner;

public class Mazepath {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		Maze(m, n, "");
		System.out.println();
		System.out.println(count);

	}

	public static void Maze(int m, int n, String ans) {
		// TODO Auto-generated method stub
		if (m == 1 && n == 1) {
			System.out.println(ans + " ");
			count = count + 1;
			return;
		}

		if (m < 1 || n < 1) {
			return;
		}

		Maze(m-1, n, ans + "V");
		Maze(m, n-1, ans + "H");
		Maze(m - 1, n - 1, ans + "D");
	}

}
