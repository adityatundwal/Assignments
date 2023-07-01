package Assignment_6;

import java.util.*;

public class Generate_ParentHesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> ll = new ArrayList<>();
		Parent(0, 0, "", n, ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

	}

	private static void Parent(int open, int close, String ans, int n, List<String> ll) {
		// TODO Auto-generated method stub
		if (close == n && open == n) {
			ll.add(ans);
			return;
		}
		
		if (close < open) {
			Parent(open, close+1, ans + ")", n, ll);
		}

		if (open < n) {
			Parent(open + 1, close, ans + "(", n, ll);
		}

		

	}

}
