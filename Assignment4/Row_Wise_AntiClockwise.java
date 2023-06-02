package Assignment_4;
import java.util.Scanner;

public class Row_Wise_AntiClockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Scanner sc = new Scanner(System.in); int n = sc.nextInt(); int m =
		 * sc.nextInt(); int [][]arr = new int [m][n];
		 * 
		 * for (int i = 0; i < arr.length; i++) { for (int j = 0; j < arr[i].length;
		 * j++) { arr[i][j] = sc.nextInt(); } }
		 */
		int[][] arr = { {1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}};
		
		
		spiralanticlock(arr);

	}
 
	private static void spiralanticlock(int[][] arr) {
		
		int minr = 0;
		int maxr = arr[0].length-1;
		
		for (int i = maxr; i >= minr; i--) {
			System.out.println(arr[maxr][i]+" ");
		}
				
	}

}
