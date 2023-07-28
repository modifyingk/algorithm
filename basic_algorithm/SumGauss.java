package basic_algorithm;

import java.util.Scanner;

public class SumGauss {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n값: ");
		int n = sc.nextInt();
		
		int sum = 0;

		sum = (1 + n) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}

}
