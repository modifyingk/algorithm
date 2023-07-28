package basic_algorithm;

import java.util.Scanner;

public class SumOf {

	static int sumof(int a, int b) {
		int sum = 0;
		
		if(a > b) {
			int t = a;
			a = b;
			b = t;
		}
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("a부터 b까지의 합을 구합니다.");
		System.out.print("a값: ");
		int a = sc.nextInt();
		System.out.print("b값: ");
		int b = sc.nextInt();
		
		int sum = sumof(a, b);
		System.out.println(a + "부터 " + b + "까지의 합은 " + sum + "입니다.");
	}

}
