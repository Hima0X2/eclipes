package abc;

import java.util.Scanner;

public class lab_3 {
	public static int maxValue(int n, int a[]) {
		if (n == 1) {
			return a[0];
		} else {
			return Math.max(a[n - 1], maxValue(n - 1, a));
		}
	}

	public static void main(String[] args) {
		int n, i;
		int[] a = new int[10];
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		for (i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		System.out.println("Max Value : " + maxValue(n, a));
	}

}
