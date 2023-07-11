package Assignment_6;
import java.util.Scanner;

public class Recursion_Twins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			twins(str);
			System.out.println(count);
		}
		
		static int count = 0;

		public static void twins(String str) {
			if(str.length()==2) {
				return;
			}
			
			if(str.charAt(0)==str.charAt(2)) {
				count++;
			}
			twins(str.substring(1));
		

	}

}
