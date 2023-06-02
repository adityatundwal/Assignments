package Assignment_3;

import java.util.Scanner;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		SelectionSot(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	public static void SelectionSot(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minindex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minindex]) {
					minindex = j;
				}
			}

			if (minindex != i) {
				int temp = arr[i];
				arr[i] = arr[minindex];
				arr[minindex] = temp;
			}
		}

	}


}
