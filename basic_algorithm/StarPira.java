package basic_algorithm;

import java.util.Scanner;

public class StarPira {

	static void spira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= (i - 1) * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("피라미드를 출력합니다.");
		int n;
		
		do {
			System.out.print("단수는: ");
			n = sc.nextInt();
		} while(n <= 0);
		
		spira(n);
	}

}
