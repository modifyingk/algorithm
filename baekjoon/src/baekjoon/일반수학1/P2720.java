package baekjoon.일반수학1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			int c = Integer.parseInt(br.readLine());
			bw.append((int)(c / 25) + " ");
			c = c % 25;
			bw.append(Math.round(c / 10) + " ");
			c = c % 10;
			bw.append((int)(c /5) + " ");
			c = c % 5;
			bw.append((int)(c / 1) + " ");
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
