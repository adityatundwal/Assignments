package Assignment_2;
import java.util.Scanner;
public class simple_Input {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);

			boolean neg = false;
			int sum = 0;

			while (neg == false) {
				int n = sc.nextInt();
				sum += n;
				if (sum >= 0) {
					System.out.println(n);
				} else {
					neg = true;
				}
			}

		}


	}

