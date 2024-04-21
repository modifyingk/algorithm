package baekjoon.약수배수소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1934 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int result = calc(a, b);
			bw.append(result + "\n");
		}
		bw.flush();
		bw.close();
	}

	// 최소공배수 구하기
	private static int calc(int a, int b) {
		int result = 0;
		int i = 1;
		while(Math.max(a, b) * i <= a * b) {
			if((Math.max(a, b) * i) % Math.min(a, b) == 0) {
				result = Math.max(a, b) * i;
				break;
			}
			i++;
		}
		return result;
	}
}
