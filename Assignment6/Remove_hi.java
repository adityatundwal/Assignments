package Assignment_6;
import java.util.Scanner;

public class Remove_hi {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		remove(str, "");
		add(str, "");
	}

	static int count = 0;

	public static void remove(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(count);
			System.out.println(ans);
			return;
		}

		if (str.startsWith("hi") && str.length() == 2) {
			count++;
			remove(str.substring(2), ans);
		} else if (str.startsWith("hi") && str.charAt(2) != 't') {
			count++;
			remove(str.substring(2), ans);
		} else {
			remove(str.substring(1), ans + str.charAt(0));
		}
	}

	public static void add(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		if (str.startsWith("hi") && str.length() == 2) {
			add(str.substring(2), ans + "bye");
		} else if (str.startsWith("hi") && str.charAt(2) != 't') {
			add(str.substring(2), ans + "bye");
		} else {
			add(str.substring(1), ans + str.charAt(0));
		}
	}

}
