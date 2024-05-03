package baekjoon.재귀함수;

import java.util.*;

public class P27433 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));
		sc.close();
	}
	
	private static long factorial(int n) {
		if(n <= 0) {
			return 1;
		}
		return n * factorial(n-1);
	}
}
