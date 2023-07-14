package Assignment_6;

public class Tower_of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		tower(n, "A", "C", "B");

	}

	public static void tower(int n, String src, String helper, String des) {
		if (n == 1) {
			System.out.println("Moving ring " + n + " from " + src + " to " + des);
			return;
		}

		tower(n - 1, src, des, helper);
		System.out.println("Moving ring " + n + " from " + src + " to " + des);
		tower(n - 1, des, src, helper);
//		System.out.println("Moving ring " + n + " from " + src + " to " + des);
//		tower(n - 1, helper, des, src);
//		System.out.println("Moving ring " + n + " from " + src + " to " + des);

	}

}
