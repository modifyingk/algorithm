package baekjoon.심화1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2444 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for(int i = 1; i <= n; i++) {
			for(int k = 0; k < n - i; k++) {
				bw.append(" ");
			}
			for(int j = 0; j < i * 2 - 1; j++) {
				bw.append("*");
			}
			bw.newLine();
		}
		for(int i = n - 1; i > 0; i--) {
			for(int k = 0; k < n - i; k++) {
				bw.append(" ");
			}
			for(int j = 0; j < i * 2 - 1; j++) {
				bw.append("*");
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
