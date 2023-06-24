package Assignment_5;

import java.util.Scanner;

public class String_Compression_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(Compress(s));

	}

	private static String Compress(String s) {
		// TODO Auto-generated method stub
		
		String ne = "";
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)) {
				count++;
			}
			else if(count>1) {
				ne+=s.charAt(i);
				ne+= count;
				count = 1;
			}
			else {
				ne+=s.charAt(i);
			}
			
		}
		return ne;
	}

}
