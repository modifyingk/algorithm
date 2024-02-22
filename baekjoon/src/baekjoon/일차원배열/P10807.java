package baekjoon.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10807 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(Integer.parseInt(st.nextToken()) == v)
				count++;
		}
		System.out.println(count);
	}
}
