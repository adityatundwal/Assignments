package Assignment_4;

import java.util.Scanner;

public class Kadenes {

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int x = 0;
		while(t-->0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int ans = Integer.MIN_VALUE;
			int sum = 0;
			for (int i = 0; i < Math.max(n, k); i++) {
				sum += i;
				x = Math.max(ans, sum);
				if(sum<0) {
					sum = 0;
				}
				
			}
			return x;
		}
		
		return -1;

	}

}
