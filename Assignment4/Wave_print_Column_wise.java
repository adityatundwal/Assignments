package Assignment_4;

import java.util.Scanner;

public class Wave_print_Column_wise {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int [][]arr = new int[M][N];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		columnwise(arr);

	}

	private static void columnwise(int[][] arr) {
		// TODO Auto-generated method stub
		
		for (int column = 0; column < arr[0].length; column++) {
			if(column%2==0) {
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][column]+", ");
				}
			}
			else {
				for (int row = arr.length-1; row >= 0; row--) {
					System.out.print(arr[row][column]+", ");
				}
			}
		}
		System.out.print("END");
		
	}

}
