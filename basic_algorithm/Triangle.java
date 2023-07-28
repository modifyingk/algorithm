package basic_algorithm;

import java.util.Scanner;

public class Triangle {

	static void triagnleLB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triagnleLU(int n) {
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triagnleRU(int n) {
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triagnleRB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삼각형을 출력합니다.");
		int n;
		
		do {
			System.out.print("단수는: ");
			n = sc.nextInt();
		} while(n <= 0);
	
		System.out.println("왼쪽 아래가 직각인 이등변삼각형");
		triagnleLB(n);

		System.out.println("왼쪽 위가 직각인 이등변삼각형");
		triagnleLU(n);

		System.out.println("오른쪽 위가 직각인 이등변삼각형");
		triagnleRU(n);
		
		System.out.println("오른쪽 아래가 직각인 이등변삼각형");
		triagnleRB(n);
	}

}
