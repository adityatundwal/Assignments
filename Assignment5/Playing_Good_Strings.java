package Assignment_5;

import java.util.Scanner;

public class Playing_Good_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.print(Check(s));

	}

	private static int Check(String s) {
		// TODO Auto-generated method stub
		int longest = 0;
		int current = 0;
		for (int i = 0; i < s.length(); i++) {
			if (vowels(s.charAt(i))==true) {
				current++;
				longest = Math.max(current, longest);
			} else {
				current = 0;
			}
		}
		return longest;
	}

	public static boolean vowels(char c) {
		char[] array = { 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < array.length; i++) {
			if (c == array[i]) {
				return true;
			}
		}
		return false;
	}

}
