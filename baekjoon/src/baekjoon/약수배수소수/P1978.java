package baekjoon.약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		boolean prime = false;
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num == 1) {
				continue;
			}
			for(int j = 2; j <= num; j++) {
				if(num % j == 0 && j != num) {
					prime = false;
					break;
				} else {
					prime = true;
				}
			}
			if(prime)
				count++;
		}
		System.out.println(count);
	}
}
