package Assignment_5;
import java.util.Scanner;
public class Can_You_Read_THis {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Newline(s);
		
	}

	private static void Newline(String s) {
		// TODO Auto-generated method stub
		String ne = "";
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch)) {
				System.out.println(ne);
				ne = "";
			}
			ne+=ch;
		}
		
		System.out.println(ne);
	}

}
