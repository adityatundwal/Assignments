package Assignment_5;

import java.util.Scanner;

public class String_Difference_Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(diff(s));
	}

	private static String diff(String s) {
		// TODO Auto-generated method stub
		String ne = "";
		int n = 0;
		for (int i = 0; i < s.length()-1; i++) {
			ne+=s.charAt(i);
			n= s.charAt(i+1)-s.charAt(i);
			ne+=n;
		}
		ne+=s.charAt(s.length()-1);
		return ne;
	}

}
