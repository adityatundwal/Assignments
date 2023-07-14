package Assignment_6;
import java.util.*;
	public class Keypad {
		static String[] key = { "", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };
		static int count = 0;
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			KeyPaid(str, "");
			System.out.println();
			System.out.println(count);
	
		}
	
		public static void KeyPaid(String ques, String ans) {
			ArrayList<Integer> answer = new ArrayList<>();
			if (ques.length() == 0) {
				System.out.print(ans + " ");
				count++;
				return;
			}
	
			char ch = ques.charAt(0);// '1'
			String s = key[ch - '0'];
			for (int i = 0; i < s.length(); i++) {
				KeyPaid(ques.substring(1), ans + s.charAt(i));
	
			}
	
		}

}