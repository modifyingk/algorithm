package baekjoon.약수배수소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0)
				break;
			System.out.println(getPrime(n));
		}
	}

	private static int getPrime(int n) {
		boolean isPrime;
		int count = 0;
		for(int i = n; i <= 2 * n; i++) {
			isPrime = true;
			if(i == 1 || i == n)
				isPrime = false;
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				count++;
		}
		return count;
	}
}
