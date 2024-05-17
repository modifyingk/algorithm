package baekjoon.재귀함수;

import java.io.*;

public class P11729 {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		hanoi(n, 1, 3, 2);
		bw.append(count + "\n");
		bw.append(sb);
		bw.flush();
		bw.close();
	}

	private static void hanoi(int n, int from, int to, int tmp) throws IOException {
		if (n == 1) {
			count++;
			sb.append(from + " " + to + "\n");
			return;
		} else {
			hanoi(n - 1, from, tmp, to);
			sb.append(from + " " + to + "\n");
			count++;
			hanoi(n - 1, tmp, to, from);
		}
	}
}
