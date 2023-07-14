package Assignment_6;

import java.util.Scanner;

public class MazePathCount {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		Maze(N1,N2,"");
		System.out.println();
		System.out.println(count);
	}

	private static void Maze(int n1, int n2, String ans) {
		// TODO Auto-generated method stub
		if(n1==1 && n2 == 1) {
			System.out.print(ans+" ");
			count = count+1;
			return;
		}
		
		if(n1<1||n2<1) {
			return;
		}
		
		Maze(n1-1,n2,ans+"V");
		
		Maze(n1,n2-1,ans+"H");
		
	}
	
	

}
