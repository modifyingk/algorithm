package baekjoon.약수배수소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4948_other {
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
		int[] arr = new int[2 * n + 1];
		for(int i = 2; i <= 2 * n; i++) {
			arr[i] = i;
		}
		for(int i = 2; i <= Math.sqrt(2 * n); i++) {
			if(arr[i] == 0)
				continue;
			for(int j = i+i; j < arr.length; j += i) {
				arr[j] = 0;
			}
		}
		int count= 0;
		for(int i = n+1; i <= 2*n; i++) {
			if(arr[i] != 0)
				count++;
		}
		return count;
	}
}
