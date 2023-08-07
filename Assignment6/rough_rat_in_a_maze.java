package Assignment_6;

import java.util.*;

public class rough_rat_in_a_maze {
	static int count = 0;

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		char[][] grid = new char[n][m];
		for (int i = 0; i < grid.length; i++) {
			String s = scn.next();
			for (int j = 0; j < grid[0].length; j++) {
				grid[i][j] = s.charAt(j);
			}
		}
		int[][] path = new int[n][m];
		rat_in_a_maze(grid, path, 0, 0);
		if (count == 0) {
			System.out.println("-1");
		}
	}

	public static void rat_in_a_maze(char[][] grid, int[][] path, int i, int j) {
		if (i == grid.length - 1 && j == grid[0].length - 1 && grid[i][j] == 'O') {
			path[i][j] = 1;
			display(path);
			count = 1;
			return;
		}
		if (i >= grid.length || j >= grid[0].length || i < 0 || j < 0 || grid[i][j] == 'X')
			return;
		path[i][j] = 1;
		grid[i][j] = 'X';
		if (count != 1)
			rat_in_a_maze(grid, path, i, j + 1);
		if (count != 1)
			rat_in_a_maze(grid, path, i + 1, j);

		path[i][j] = 0;
		grid[i][j] = 'O';
	}

	public static void display(int[][] path) {
		for (int i = 0; i < path.length; i++) {
			for (int j = 0; j < path[0].length; j++) {
				System.out.print(path[i][j] + " ");
			}
			System.out.println();
		}
	}
}