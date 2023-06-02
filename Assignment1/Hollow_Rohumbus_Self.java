package Assignment_1;
import java.util.Scanner;


public class Hollow_Rohumbus_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 1;
		int space = n-1;
		int space2 = n-2;
		
		while(row <= n) {
			int i = 1;
			while(i <= space) {
				System.out.print(" ");
				i++;
			}
			if (row==1 || row == n) {
				int k = 1;
				while(k < n) {
					System.out.print("*");
					k++;
				}
			}
			else {
				System.out.print("*");
				int j = 1;
				while(j <= space2) {
					System.out.print(" ");
					j++;
				}
			}
			System.out.print("*");
			row++;
			space--;
			System.out.println();
		}

	}

}
