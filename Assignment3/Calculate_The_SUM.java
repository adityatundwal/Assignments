package Assignment_3;
import java.util.Scanner;

public class Calculate_The_SUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
 
        int temp[] = new int[n];
        for(int i=0; i<n; i++)
            temp[i] = a[i];
 
        int q = sc.nextInt();
        while(q-- > 0)
        {
            int x = sc.nextInt();
            x = x % a.length;
 
            for(int i=0; i<n; i++)
            {
                int r = i - x;
                if(r < 0)
                    r = n + r;
 
                a[i] += temp[r];
            }
 
            for(int i=0; i<n; i++)
                temp[i] = a[i];
        }
 
        int sum = 0;
        for(int i=0; i<n; i++)
            sum += a[i];
 
        System.out.println(sum % ((int)Math.pow(10, 9) + 7));

	}

}
