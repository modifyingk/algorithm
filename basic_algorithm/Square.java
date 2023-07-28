package basic_algorithm;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("정사각형을 출력합니다.");
		do {
			System.out.print("변의 길이: ");
			n = sc.nextInt();
		} while(n <= 0);
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
