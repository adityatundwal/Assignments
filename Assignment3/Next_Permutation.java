package Assignment_3;

import java.util.Scanner;

public class Next_Permutation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
		
		int n = sc.nextInt();
		int []arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		Permutation(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		
		
		}
		
	}

	private static void Permutation(int[] arr) {
		// TODO Auto-generated method 

		int p = 0;
		int q = 0;
		int n = arr.length;
		for (int i = n-2; i >= 0; i--) {
			if(arr[i]<arr[i+1]) {
				p=i;
				break;
			}
			
		}
		
		for (int i = n-1; i > p; i--) {
			if(arr[i]>arr[p]) {
				q = i;
				break;
			}
		}
		if(p==0&&q==0) {
			Reverse(arr,0,n-1);
			return;
		}
		
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
		Reverse(arr, p+1,n-1);
		
	}

	private static void Reverse(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
