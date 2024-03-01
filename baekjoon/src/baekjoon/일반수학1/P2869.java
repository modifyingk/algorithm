package baekjoon.일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()); // 낮
		int b = Integer.parseInt(st.nextToken()); // 밤
		int v = Integer.parseInt(st.nextToken()); // 높이
		int day = 1;
		if(v % (a - b) == 0) {
			v = v - a;
			day += (v - (a-b) + 1);
		} else {
			day += v / a;
		}
		System.out.println(day);
	}
}
