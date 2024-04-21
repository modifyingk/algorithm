package baekjoon.약수배수소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P13241 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		
		long result = (a * b / gcd(a, b)); // 최소공배수
		bw.append(result + "\n");
		bw.flush();
		bw.close();
	}

	// 최대공약수 구하기
	private static long gcd(long a, long b) {
		while(b != 0) {
			long r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
