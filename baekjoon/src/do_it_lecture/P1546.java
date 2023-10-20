package do_it_lecture;

import java.util.Scanner;

public class P1546 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] score = new int[n];
		for(int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
		}
		
		long max = 0;
		long sum = 0;
		
		for(int i = 0; i < n; i++) {
			if(score[i] > max) {
				max = score[i];
			}
			sum += score[i];
		}
		
		System.out.println(sum * 100.0 / max / n);
	}
}
