package baekjoon.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int min = x;
		int max = x;
		for(int i = 1; i < n; i++) {
			x = Integer.parseInt(st.nextToken());
			if(min > x)
				min = x;
			if(max < x)
				max =x;
		}
		System.out.println(min + " " + max);
	}
}
