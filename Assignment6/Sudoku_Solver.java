package Assignment_6;

import java.util.Scanner;

public class Sudoku_Solver {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int  [][]arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt(); 
			}
		}
		
		Sudoku(arr,0,0);
		
	}
	
	private static void Sudoku(int[][] grid, int row, int col) {
		// TODO Auto-generated method stub
		if (col == 9) {
			row++;
			col = 0;
		}

		if (row == 9) {
			Display(grid);
			return;
		}
		if (grid[row][col] != 0) {
			Sudoku(grid, row, col + 1);
		} else {
			for (int val = 0; val <= 9; val++) {
				if (itissafe(grid, row, col, val) == true) {
					grid[row][col] = val;
					Sudoku(grid, row, col + 1);
					grid[row][col] = 0;
				}
			}
		}
	}
	
	private static boolean itissafe(int[][] grid, int row, int col, int val) {
		// TODO Auto-generated method stub
		// row
		for (int i = 0; i < 9; i++) {
			if (grid[row][i] == val) {
				return false;

			}
		}

		for (int i = 0; i < 9; i++) {
			if (grid[i][col] == val) {
				return false;
			}
		}

		int r = row - row % 3;
		int c = col - col % 3;
		for (int i = r; i < r+3; i++) {
			for (int j = c; j < c+3; j++) {
				if(grid[i][j]==val) {
					return false;
				}
			}
		}

		return true;
	}

	
	private static void Display(int[][] grid) {
		// TODO Auto-generated method stub
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

}
