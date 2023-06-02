package Assignment_4;

import java.util.Scanner;

public class Row_wise_Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int [][] arr = new int [M][N];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {	
				arr[i][j] = sc.nextInt();
				
			}
		}
		
		rowwise(arr);
		
	}

	private static void rowwise(int[][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j]+", ");
				}
			}
			else {
				for (int j = arr.length; j >= 0; j--) {
					System.out.print(arr[i][j]+", ");
				}
			}
			
		}
		System.out.println("END");
	}

}
