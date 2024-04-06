package baekjoon.브루트포스;

import java.util.Scanner;

public class P1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 665;
		int count = 0;
		while(count < n) {
			num++;
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		System.out.println(num);
		sc.close();
	}
}
