package Assignment_5;

import java.util.Scanner;

public class CamelClassSplit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		SplitCamel(s);
		System.out.println(s);
	}

	private static void SplitCamel(String s) {
		// TODO Auto-generated method stub
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch)) {
				s.split(s);
			}
		}
		
	}
		
	
}


	