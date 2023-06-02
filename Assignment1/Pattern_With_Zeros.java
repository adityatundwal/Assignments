package Assignment_1;
import java.util.Scanner;

public class Pattern_With_Zeros {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 1;
		int star = 1;
		int count = 1;
		
		while(row<=n) {
			int i = 1;
			while(i<=star) {
				if (i == 1 || i == row) {
					System.out.print(count+" ");
				}
				else {
					System.out.print("0 ");
				}
				i++;
			}
			count++;
			row++;
			star++;
			System.out.println();
			
			
		}
	}

}
