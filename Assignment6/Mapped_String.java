package Assignment_6;
import java.util.*;

public class Mapped_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Mapped(s,"");

	}

	public static void Mapped(String s, String ans) {
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}

		String s1 = s.substring(0, 1);
		int a = Integer.parseInt(s1);
		char ch = (char) (64 + a);
		Mapped(s.substring(1), ans + ch);
		if (s.length() >= 2) {
			s1 = s.substring(0, 2);
			a = Integer.parseInt(s1);
			if(a<=26) {
				ch = (char) (64 + a);
				Mapped(s.substring(2), ans + ch);
			}
			
		}}

}
