package Assignment_5;
import java.util.*;
public class Max_Frequency_Char{        

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		System.out.println(getMax(S));
		
	}
	
	
	public static char getMax(String S) {
	HashMap<Character, Integer> mp = new HashMap<>();
		
		int n = S.length();
		
		char ans = 0;
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			char c = S.charAt(i);
			mp.put(c, mp.getOrDefault(c, 0)+1);		
			
			if(count<mp.get(c)) {
				ans = c;
				count = mp.get(c);
			}
		}
		return ans;
	}

}
