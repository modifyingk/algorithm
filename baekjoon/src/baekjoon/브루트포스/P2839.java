package baekjoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2839 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = Integer.MAX_VALUE;
		for(int i = 0; i <= n / 3; i++) {
			int tmp = sum(i, n);
			if(tmp != -1)
				count = Math.min(count, sum(i, n));
		}
		if(count == Integer.MAX_VALUE)
			count = -1;
		System.out.println(count);
	}
	
	private static int sum(int i, int n) {
		int num = 3 * i;
		int cnt = i;
		while(num < n) {
			num += 5;
			cnt++;
		}
		if(num == n)
			return cnt;
		else
			return -1;
	}
}
