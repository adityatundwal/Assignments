package Assignment_1;
import java.util.Scanner;


public class Hollow_Rhombus {

	public static void main(String[] args) {Scanner sc = new Scanner(System.in);
	// initial
	int n = sc.nextInt();
	int row = 1;
	int star = 1;
	int space = n - 1;
	int space2 = n - 2;
	// loop
	while (row <= n) {
		// space
		int i = 1;
		while (i <= space) {
			System.out.print(" ");
			i++;
		}
		// star
		if (row == 1 || row == n) {
			int k = 1;
			while (k < n) {
				System.out.print("*");
				k++;
			}
		} else {
			System.out.print("*");
			// space
			int j = 1;
			while (j <= space2) {
				System.out.print(" ");
				j++;
			}
		}
		// star
		System.out.print("*");
		// NextLine
		row++;
		space--;
		System.out.println();
	}}

}
