package Assignment_6;

import java.util.*;

public class Sub_TOH {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		tower(n, "A", "C", "B");

	}

	public static void tower(int i, String disk1, String disk2, String disk3) {
		if (i == 1) {
			System.out.println("Moving ring " + i + " from " + disk1 + " to " + disk3);
			return;
		}
		tower(i - 1, disk1, disk3, disk2);
		System.out.println("Moving ring " + i + " from " + disk1 + " to " + disk3);
		tower(i - 1, disk2, disk1, disk3);

	}
}