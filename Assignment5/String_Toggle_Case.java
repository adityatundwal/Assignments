package Assignment_5;

import java.util.Scanner;

public class String_Toggle_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(Toggle(s));

	}

	private static String Toggle(String s) {
		// TODO Auto-generated method stub
		String ne = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isLowerCase(ch)) {
				ne+=Character.toUpperCase(ch);
			}
			else if(Character.isUpperCase(ch)) {
				ne += Character.toLowerCase(ch);
			}
			else {
				ne+=ch;
			}
		}
		return ne;
	}

}
