package baekjoon.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] grade = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			grade[i] = Integer.parseInt(st.nextToken());
		}
		int max = grade[0];
		for(int i = 1; i < n; i++) {
			if(max < grade[i])
				max = grade[i];
		}
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum += grade[i];
		}
		System.out.println((sum / max * 100) / n);
	}
}
