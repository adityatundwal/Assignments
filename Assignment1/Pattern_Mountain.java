package Assignment_1;
import java.util.Scanner;

public class Pattern_Mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 1;
		int space =  2*n-3;
		
		
		while(row <= n) {
			int i = 1;
			int count = 1;
			while(i <= star) {
				System.out.print(count+" ");
				i++;
				count++;
			}
			int k = 1;
			while(k <= space) {
				System.out.print("  ");
				k++;
			}
			
			int j = 1;
			int count2 = row;
			
			if (row==n) {
				count2 = row-1;
				j++;
			}
			while(j <= star) {
				System.out.print(count2+" ");
				count2--;
				j++;
				

			}
			if (row<n) {
				star++;
				count++;
				}
			else {
				count--;
				star--;
			}
			
			
			row++;
			space-=2;
			System.out.println();
			
		}

	}

}
