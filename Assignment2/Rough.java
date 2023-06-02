package Assignment_2;
import java.util.Iterator;
import java.util.Scanner;

public class Rough {
    public static void main(String args[]) {
        
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 2*n+1;
		int space = 0;	
		int num = n;
		
		
		while(row <= 2*n+1) {
			
			int k = 1;
			while(k <= space) {
				System.out.print("  ");
				k++;
			}
			int i = 1;
			int count = num;
			while(i <= star) {
				System.out.print(count+" ");
				if (i<=star/2) {
					count--;
				}
				else {
					count++;
				}
				i++;
			}
			
			if (row<=n) {
				star-=2;
				space++;
				num--;
			}
			else {
				star+=2;
				space--;
				num++;
			}
			row++;
			System.out.println();			
		}
		
	
	}
}
