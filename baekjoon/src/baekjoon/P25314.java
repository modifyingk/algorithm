package baekjoon;

import java.util.Scanner;

public class P25314 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n / 4;
		for(int i = 0; i < num; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
		sc.close();
	}
}
