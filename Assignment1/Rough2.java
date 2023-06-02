package Assignment_1;
import java.util.Scanner;
public class Rough2 {
	
	
	public static void main(String[] args){

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 1;
		
		int a = 0;
		int b = 1;
		
		while(row <= n) {
			int i = 1;
			while(i <= star) {
				System.out.print(a + "	");
				int c = a + b;
				a = b;
				b = c;
				i++;
			}
			
			row++;
			star++;
			System.out.println();
		}
	}

}

