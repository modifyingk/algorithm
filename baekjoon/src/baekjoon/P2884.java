package baekjoon;

import java.util.Scanner;

public class P2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		if(m >= 45)
			System.out.println(h + " " + (m - 45));
		else {
			if(h == 0) h = 24;
			System.out.println((h - 1) + " " + (m + 15));
		}
		sc.close();
	}
}
