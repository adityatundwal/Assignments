package Assignment_6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Dictionary_Order_Large {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<String> list = new ArrayList<>();
		Permutations(str, "", str, list);
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

	private static void Permutations(String ques, String ans, String org, ArrayList<String> list) {
		// TODO Auto-generated method
		if (ques.length() == 0) {
			if (ans.compareTo(org) > 0) {
				list.add(ans);
			}

			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(i + 1);
			Permutations(ros, ans + ch, org, list);
		}

	}

}
