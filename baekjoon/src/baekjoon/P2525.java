package baekjoon;

import java.util.Scanner;

public class P2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		b += c;
		if(b >= 60) {
			int h = (a + (b / 60)) % 24;
			int m = b % 60;
			System.out.println(h + " " + m);
		} else {
			System.out.println(a + " " + b);
		}
		sc.close();
	}
}
