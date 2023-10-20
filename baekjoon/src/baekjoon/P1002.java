package baekjoon;

import java.util.Scanner;

public class P1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tNum = sc.nextInt();
		int[] position = new int[6];
		for(int i = 0; i < tNum; i++) {
			for(int j = 0; j < 6; j++) {
				position[j] = sc.nextInt();
			}
		}
	}
}


