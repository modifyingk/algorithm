package basic_algorithm;

import java.util.Scanner;

public class SumVerbose1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		int n;
		
		do {
			System.out.print("n값: ");
			n = sc.nextInt();
		} while(n <= 0);
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(i < n) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			}
			sum += i;
		}
		System.out.println(sum);
	}
}
