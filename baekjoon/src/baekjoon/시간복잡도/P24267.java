package baekjoon.시간복잡도;

import java.util.Scanner;

public class P24267 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(n * (n-1) * (n-2) / 6);
		System.out.println(3);
		sc.close();
	}
}
