package baekjoon.조합론;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1010 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			long n = Integer.parseInt(st.nextToken());
			long m = Integer.parseInt(st.nextToken());
			long result = 1;
			long k = Math.min(n, m-n);
			for(long j = 0; j < k; j++) {
				result *= m;
				m--;
			}
			for(long j = k; j > 0; j--) {
				result /= j;
			}
			bw.append(result + "\n");
		}
		bw.flush();
		bw.close();
	}
}
