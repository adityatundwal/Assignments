package Assignment_6;
import java.util.*;

public class Binary_strings {

	public static void main(String[] args) {

	     Scanner scn=new Scanner(System.in);
	     int nt=scn.nextInt();
	     while(nt-->0){
	         String s=scn.next();
	         generate_binary_Strings(s,"");
	         System.out.println();
	     }
	         }
	         public static void generate_binary_Strings(String s,String ans){
	      if(s.length()==0){System.out.print(ans+" ");return;}
	             if(s.charAt(0)=='?'){
	               generate_binary_Strings(s.substring(1),ans+'0');
	               generate_binary_Strings(s.substring(1),ans+'1');
	             }
	             else  
	             generate_binary_Strings(s.substring(1),ans+s.charAt(0));
	}

}

