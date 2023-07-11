package Assignment_6;
import java.util.Scanner;

public class Replace_pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			ans(str, "");
		}
	}

	public static void ans(String str, String ans) {
		
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}

		if (str.startsWith("pi")) {
			ans(str.substring(2), ans + "3.14");
		} else {
			ans(str.substring(1), ans + str.charAt(0));
		}

	}

}
