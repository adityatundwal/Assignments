package Assignment_5;

import java.util.Scanner;

public class Count_Palindromic_Sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(Count(s));

	}

	private static int Count(String s) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				String v = s.substring(i,j);
				if(isPalindrome(v)==true) {
					count++;
				}
			}
		}
		
		return count;
	}

	private static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = s.length()-1;
		while(i<j) {
			if(s.charAt(i)==s.charAt(j)) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	

}
