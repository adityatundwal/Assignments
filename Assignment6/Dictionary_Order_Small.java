package Assignment_6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Dictionary_Order_Small {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String s= sc.next();
        List<String > l= new ArrayList<>();

        smaller(s, s, l, "");
        Collections.sort(l);
        for (int i=0; i< l.size(); i++){
            System.out.println(l.get(i));
        }
    }

    public static void smaller(String s, String os, List<String> l, String ans){

        //Base case
        if (s.length() == 0){
            if (os.compareTo(ans) > 0){
                l.add(ans);
                return;
            }
        }

        for (int i= 0; i< s.length(); i++){

           char  ch= s.charAt(i);
           String s1= s.substring(0, i);
           String s2= s.substring(i+1);

           smaller(s1+s2, os, l, ans + ch);
        }
    }
}