package Assignment_6;

import java.util.Scanner;

public class String_To_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(atoi(s));
		
	}
	
	public static int atoi(String s){
		if(s.length()==0)
		{
			return 0;
		}
		return s.charAt(s.length()-1)-'0'+(10*atoi(s.substring(0,s.length()-1)));
		
	}


}
