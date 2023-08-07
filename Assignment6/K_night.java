package Assignment_6;

import java.util.Scanner;

public class K_night {
	static int count = 0;

	public static void main(String[] args) {
		
		//Took Input

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] board = new boolean[n][n];
		//Called the function
		Knight(board, 0, 0, "", n);
		
		//Printed count according to expected output
		
		System.out.println("\n" + count);
	}

	private static void Knight(boolean[][] board, int cr, int cc, String ans, int n) {
		// TODO Auto-generated method stub
		
		//Recursive call until n
		if (n == 0) {
			//Printing the iteration of ans
			System.out.print(ans + " ");
			//Counting the number of ans
			count++;
			return;
		}
		
		//If column is at the end set the column to zero and move the row

		if (cc == board.length) {
			cr++;
			cc = 0;
		}
		
		//if the row is at the end then return to the function
		if (cr == board.length) {
			return;
		}
		
		//issafe function

		if (issafe(board, cr, cc)) {
			//setting default value
			board[cc][cr] = true;
			Knight(board, cr, cc + 1, ans + "{" + cr + "-" + cc + "} ", n - 1);
			//after iteration changing the value of row and column to false
			//backtrackking call
			board[cr][cc] = false;
		}
		//incrementing the column using recursive function
		Knight(board, cr, cc + 1, ans, n);
	}

	private static boolean issafe(boolean[][] board, int cr, int cc) {
		// TODO Auto-generated method stub
		//first taking row -1 and going 2 columns back thats why -1 and 2 pattern:-> _ _| 
		//second taking row -1 and going -2 columns back thats why -1 and 2 pattern:-> |_ _
		
		//third taking row -2 and going 1 columns forward thats why -1 and 2 pattern:-> up up and left ||<-
		//fourth taking row -2 and going -1 columns down thats why -2 and -1 pattern:-> ||->



		
		int[] r = { -1, -1, -2, -2 };
		int[] c = { 2, -2, 1, -1 };
		//Using an iteration on column and row
		for (int i = 0; i < c.length; i++) {
			int x = cr + r[i];
			int y = cc + c[i];
			//if condition is safe return false
			//justlike nqueen
			
			if (x >= 0 && y >= 0 && x < board.length && y < board.length && board[x][y] == true) {
				return false;
			}
			
			//else return true
		}
		return true;
	}

}
