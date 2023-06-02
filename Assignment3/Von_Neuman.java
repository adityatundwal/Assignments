package Assignment_3;
import java.util.Scanner;

public class Von_Neuman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-->0) {
			int sum = 0;
			int n = sc.nextInt();
			int mul = 1;
			int power = 0;

			while (n > 0) {

				int rem = n % 10;
				sum = (int) (sum + (rem *(Math.pow(2, power)))); // rem*2^power (power=0-n)

				n = n / 10;
				power++;
			}

			System.out.println(sum);
		}
		
	}

	
		
	}

