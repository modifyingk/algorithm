package baekjoon.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[42];
		for(int i = 0; i < 10; i++) {
			int mod = (Integer.parseInt(br.readLine())) % 42;
			arr[mod]++;
		}
		int count = 0;
		for(int i = 0; i < 42; i++) {
			if(arr[i] > 0)
				count++;
		}
		System.out.println(count);
	}
}
