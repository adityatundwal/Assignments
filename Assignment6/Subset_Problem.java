package Assignment_6;
import java.util.Scanner;

public class Subset_Problem {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int arr[] = new int[n];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = sc.nextInt();
				}
				int m = sc.nextInt();

				subSet(n, arr, m, "", 0);
				System.out.println();
				System.out.println(count);
			}

			public static void subSet(int n, int arr[], int m, String ans, int idx) {
				if (m == 0) {
					System.out.print(ans + "  ");
					count++;
					return;
				}

				if (m < 0) {
					return;
				}

				for (int i = idx; i < arr.length; i++) {
					subSet(n, arr, m - arr[i], ans + arr[i] + " ", i + 1);
				}
			}

	}
