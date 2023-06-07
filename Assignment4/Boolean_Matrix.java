import java.util.*;
public class Main {
    public static void main (String args[]) {

	   
	    Scanner sc = new Scanner(System.in);
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	    int [][]arr = new int [m][n];
	    for (int i = 0;i<arr.length; i++ ){
	        for(int j = 0; j<arr[i].length; j++){
	            arr[i][j] = sc.nextInt();
	        }
	    } 
	    modifyMatrix(arr, n,m);
	    for (int i = 0;i<arr.length; i++){
	        for(int j = 0; j<arr[i].length; j++){
	            System.out.print(arr[i][j]+" ");
	        }
	        System.out.println();
	    } 
	}
	public static void modifyMatrix(int mat[][], int n, int m) {
		if (n == 1 && m == 1) {
			return;
		}

		int row[] = new int[n];
		int col[] = new int[m];

		// Mark the rows and columns that are to be made 1
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j] == 1) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (row[i] == 1 || col[j] == 1) {
					mat[i][j] = 1;
				}
			}
		}

    }
}
