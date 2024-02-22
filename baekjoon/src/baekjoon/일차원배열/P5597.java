package baekjoon.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5597 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] submit = new boolean[30];
		for(int i = 0; i < 28; i++) {
			int idx = Integer.parseInt(br.readLine());
			submit[idx - 1] = true;
		}
		for(int i = 0; i < 30; i++) {
			if(!submit[i])
				System.out.println(i + 1);
		}
	}
}
