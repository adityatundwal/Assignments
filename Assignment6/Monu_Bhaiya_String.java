package Assignment_6;
import java.util.*;

public class Monu_Bhaiya_String {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(removeDupe(s));
		
	}
	
	
	public static String removeDupe(String s) {


		Stack<Character> st = new Stack<>();
		int freq[] = new int[26];
		boolean exist[] = new boolean[26];

		for(int i=0; i<s.length(); i++){
		    char ch = s.charAt(i);
				freq[ch -'a']++;
		}
	
		
		for(int i = 0; i<s.length(); i++){
		    char ch = s.charAt(i);
		    freq[ch-'a']--;
		    if(exist[ch-'a']){
		       continue;
		    }
		    
		    while(st.size()>0&&st.peek()>ch&&freq[st.peek()-'a']>0){
		        char rem = st.pop();
		        exist[rem-'a'] = false;
		    }
		    st.push(ch);
		    exist[ch-'a'] = true;
		}
		char ans[] = new char[st.size()];
		int i = ans.length-1;
		while(i>=0)ans[i--]=st.pop();
		
		return new  String(ans);
	}
        
}
