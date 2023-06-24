package Assignment_5;

import java.util.Scanner;

public class Remove_Dupe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(Remove(s));
	}

	private static String Remove(String s) {
		// TODO Auto-generated method stub
		String ne = "";
		int counter = 1;
		
		for (int i = 0; i < s.length(); i++) {
			if(i==s.length()-1||s.charAt(i)!=s.charAt(i+1)) {
				ne+=s.charAt(i);
			}
		}
		
		return ne;
	}

}
