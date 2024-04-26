package baekjoon.약수배수소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2485 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		// 가로수 입력
		int[] tree = new int[n];
		for(int i = 0; i < n; i++) {
			tree[i] = Integer.parseInt(br.readLine());
		}

		// 간격 최대공약수
		int gcd = 0;
		for(int i = 0; i < tree.length - 1; i++) {
			gcd = gcd(tree[i+1] - tree[i], gcd);
		}
		
		System.out.println((tree[n-1] - tree[0]) / gcd + 1 - tree.length);
		
	}
	private static int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
