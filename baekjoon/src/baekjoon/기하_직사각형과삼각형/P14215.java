package baekjoon.기하_직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14215 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		if(a == b && b == c) {
			sum = a + b + c;
		} else {
			int max = Math.max(Math.max(a, b), c); // 가장 긴 변
			int twoLen = a + b + c - max; // 나머지 두 변의 합
			if(twoLen <= max) {
				max = twoLen - 1;
			}
			sum = max + twoLen;
		}
		System.out.println(sum);
	}
}
