package Hackerrank;

import java.util.Scanner;

public class katappa {
	static Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {
		int T, sum = 0, temp = 0;
		T = myScanner.nextInt();
		long N;
		for (int i = 1; i <= T; i++) {
			N = myScanner.nextLong();
			for (int j = 1; j <= N; j++) {
				if ((j % 2 == 0) || (j % 3 == 0) || (j % 5 == 0)) {
					sum++;
				}
			}
			prln(sum);
			
		}
	}
	static void prln(Object any) {
		System.out.println(any);
	}
	static void pr(Object any) {
		System.out.print(any);
	}

}
