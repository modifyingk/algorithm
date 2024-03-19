package baekjoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2231_other {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i = 1; i < n; i++) {
			int num = i;
			int sum = 0;
			while(num != 0) {
				sum += num % 10;
				num /= 10;
			}
			if(i + sum == n) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
