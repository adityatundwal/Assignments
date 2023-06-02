package Assignment_3;

public class Trapping_rain_water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	}
	public static int Water(int[] arr) {
		int [] left = new int[arr.length];
		left[0] = arr[0];
		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(left[i-1], arr[i]);
		}
		
		int [] right = new int[arr.length];
		right[arr.length-1] = arr[arr.length-1];
		for (int i = arr.length-2; i >= 0; i--) {
			right[i] = Math.max(right[i+1], arr[i]);
		}
		
		int sum = 0;
		for (int i = 0; i < right.length; i++) {
			sum = sum+Math.min(left[i], right[i])-arr[i];
		}
		return sum;
	}

}
