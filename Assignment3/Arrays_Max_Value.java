package Assignment_3;
import java.util.*;

public class Arrays_Max_Value {

    public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Max(arr));

	}

	private static int Max(int[] arr) {
		// TODO Auto-generated method stub
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;

    }

}
