package Assignment_6;

import java.util.Scanner;

public class printsubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str =  sc.nextLine();
		printsseq(str,"");
		System.out.println(count);

	}
	
	static int count = 0;
	
	private static void printsseq(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			System.out.print(ans+" ");
			count++;
			return;
		}
		
		char ch = ques.charAt(0);
		printsseq(ques.substring(1),ans);
		printsseq(ques.substring(1),ans+ch);
	}

	
	

}
