package Assignment_6;

import java.util.Scanner;

public class N_Queen {
	static int count = 0;

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		boolean[][] board = new boolean[n][n];
		n_queen(board, 0, 0);
		System.out.println();
		System.out.println(count);
	}

	public static void n_queen(boolean[][] board, int row, int tq) {
		if (tq == board.length) {
			print_arrangement(board);
			count++;
			return;
		}
		if (row == board.length)
			return;
		for (int col = 0; col < board.length; col++) {
			if (isPOssible(board, row, col)) {
				board[row][col] = true;
				n_queen(board, row + 1, tq + 1);
				board[row][col] = false;
			}
		}

	}

	public static void print_arrangement(boolean[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				int q = i + 1;
				int pos = j + 1;
				if (board[i][j])
					System.out.print("{" + q + "-" + pos + "} ");
			}
		}
		System.out.print(" ");
	}

	public static boolean isPOssible(boolean  [][] board,int r,int c){
        for(int i=0;i<r;i++){if(board[i][c])return false;}
        int i=r;int j=c;
                while(i>=0&&j>=0){
           if(board[i][j])return false;i--;j--;
        }
        i=r;j=c;
        while(i>=0&&j<board.length){
           if(board[i][j])return false;i--;j++;
        }
        return true;
    
	}
}
