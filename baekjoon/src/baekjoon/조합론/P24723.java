package baekjoon.조합론;

import java.util.Scanner;

public class P24723 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println((int)Math.pow(2, n));
		sc.close();
	}
}
