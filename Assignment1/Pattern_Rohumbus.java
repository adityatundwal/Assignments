package Assignment_1;
import java.util.Scanner;

public class Pattern_Rohumbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 1;
		int star = 1;
		int space = n-1;
		int num = row;

		
		while(row <= 2*n-1) {
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			int k = 1;
			int count = num;
			while(k <= star) {
				
				System.out.print(count+" ");

				if(k<=star/2) {
					count++;
				}
				else {
					count--;
				}
				k++;
			}
			if (row<n) {
				star+=2;
				space--;
				num++;
				}
			else {
				star-=2;
				space++;
				num--;
			}
			row++;
			System.out.println();
		}

	}

}
