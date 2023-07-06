package Assignment_6;

import java.util.*;

public class Vivek_Loves_Array_Game {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int ans = game(arr, 0, arr.length - 1);

			System.out.println(ans);

		}
	}

	public static int game(int[] arr, int lo, int hi) {

		int leftsum = 0;
		int totalsum = 0;

		for (int i = lo; i <= hi; i++) {

			totalsum += arr[i];

		}

		for (int i = lo; i < hi; i++) {

			leftsum += arr[i];

			int rightsum = totalsum - leftsum;

			if (leftsum == rightsum) {

				return 1 + Math.max(game(arr, lo, i), game(arr, i + 1, hi));
			}

		}
		return 0;
	}

}
