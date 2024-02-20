package baekjoon;

import java.util.Scanner;

public class P2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a == b && b == c) {
			System.out.println(10000 + (a * 1000));
		} else if(a != b && b != c && a != c) {
			int max = a;
			if(a < b && c < b) max = b;
			else if(a < c && b < c) max = c;
			System.out.println(max * 100);
		} else {
			int n = 0;
			if(a == b) n = a;
			else if(b == c) n = b;
			else if(a == c) n = c;
			System.out.println(1000 + (n * 100));
		}
		sc.close();
	}
}
