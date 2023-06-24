package Assignment_5;
import java.util.*;

public class String_Ispalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub     
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(Palindromecheck(s));
	}

	private static boolean Palindromecheck(String s) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}

}
