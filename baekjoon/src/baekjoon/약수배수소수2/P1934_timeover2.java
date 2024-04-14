package baekjoon.약수배수소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1934_timeover2 {
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

	private static int calc(int a, int b) {
		int result = a * b;
		for(int i = 2; i <= result; i++) {
			if(a % i == 0 && b % i == 0) {
				int tmp = i * (a / i) * (b / i);
				result = Math.min(result, tmp);
			}
		}
		return result;
	}
}
