package Assignment_5;

import java.util.Scanner;

public class String_Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		System.out.println(Convert(s));
	}

	private static String Convert(String s) {
		// TODO Auto-generated method stub
		
		String ne = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(i%2==0 || i == 0) {
				ne += (char)(c+1);
			}
			else {
				ne  += (char)(c-1);
			}
		}
		return ne;
		
	}

}
