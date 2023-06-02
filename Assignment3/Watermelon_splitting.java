package Assignment_3;
import java.util.Scanner;

	public class Watermelon_splitting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		
		if(w>2) {
			if(w%2==0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		else {
			System.out.println("NO");
		}
		

	}

}
