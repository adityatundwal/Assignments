package Assignment_1;
import java.util.Scanner;

public class Number_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int num = 1;
		int count = 1;
		
		while(row <= n) {
			int i = 1;
			while(i <= num) {
				System.out.print(count+"\t");
				i++;
				count++;
			}
			row++;
			System.out.println();
			num++;
		}

	}

}
