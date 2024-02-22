package baekjoon.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.parseInt(br.readLine());
		int idx = 0;
		for(int i = 1; i < 9; i++) {
			int  x = Integer.parseInt(br.readLine());
			if(max < x) {
				max = x;
				idx = i;
			}
		}
		System.out.println(max);
		System.out.println(idx + 1);
	}
}
