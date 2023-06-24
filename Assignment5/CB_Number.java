package Assignment_5;
import java.util.Scanner;


public class CB_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String s = sc.next();
		System.out.println(CountCB(s));

	}

	public static int CountCB(String s) {

		int count = 0;
		boolean[] visited = new boolean[s.length()];
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				String s1 = s.substring(i, j);// we put value (subarrays length wise) in string s1

				// Right now above numbers are in the form of string we want them to change in
				// string to check

				// Integer.parseInt(s1)--> string ko number (int)
				// Long.parseLong(s1)--> string ko number (long)

				long num = Long.parseLong(s1); // here we are converting it into long as there is a constraint
				if (isCbNumber(num) == true && isvisited(visited, i, j) == false) {
					count++;

					for (int k = i; k < j; k++) {
						visited[k] = true;// this is the loop to mark whether we are visited or not
					}
				}
			}
		}
		return count;

	}

//this is the loop to check whether are we visited or not
	public static boolean isvisited(boolean[] visited, int i, int j) {
		for (int k = i; k < j; k++) {
			if (visited[k] == true) {
				return true;
			}
		}
		return false;
	}

	public static boolean isCbNumber(long num) {
		// *1
		if (num == 0 || num == 1) {
			return false;
		}

		// *2
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return true;
			}
		}
		// *3
		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] == 0) {
				return false;
			}
		}
		return true;

	}

}