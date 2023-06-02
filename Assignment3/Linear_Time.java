package Assignment_3;
import java.util.Scanner;
public class Linear_Time {
	

    public static void main(String args[]) {
         Scanner scn=new Scanner(System.in);
        int n = scn.nextInt(); 
         int[] arr=new int[n];
           for (int i = 0; i < n; i++) 
            arr[i]=scn.nextInt();
            sortColors(arr); 
           for (int i = 0; i < arr.length; i++){
              System.out.println(arr[i]);
           }
    }
    public static void sortColors(int[] nums) {
		int i = 0; // zero ke index ka track
		int j = nums.length-1; //2 ke index ka track
		int k = 0;
		
		while(k<=j) {
			if(nums[k]== 0) {
				int temp = nums[k];
				nums[k] = nums[i];
				nums[i] = temp;
				i++;
				k++;
			}
			
			else if(nums[k]==2) {
				int temp = nums[k];
				nums[k] = nums[j];
				nums[j] = temp;
				j--;
			}
			else {
				k++;
			}
		}

}
    }
