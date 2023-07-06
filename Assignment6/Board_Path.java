package Assignment_6;

import java.util.Scanner;

public class Board_Path {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Boardpath(N, M, 0, "");
		System.out.println(count);

	}
	
	static int count = 0;

	private static void Boardpath(int n, int m, int curr, String ans) {
		// TODO Auto-generated method stub
		if (curr == n) {
			System.out.print(ans+" ");
			count+=1;
			return;
		}
		if (curr > n) {
			return;
		}

		for (int dice = 1; dice < m; dice++) {
			Boardpath(n, m, curr + dice, ans + dice);
			
		}

	}

}
