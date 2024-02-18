package baekjoon;

import java.util.Scanner;

public class P2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		int calc1 = a * (b.charAt(2) - '0');
		int calc2 = a * (b.charAt(1) - '0');
		int calc3 = a * (b.charAt(0) - '0');
		System.out.println(calc1);
		System.out.println(calc2);
		System.out.println(calc3);
		System.out.println(calc1 + calc2 * 10 + calc3 * 100);
		sc.close();
	}
}
