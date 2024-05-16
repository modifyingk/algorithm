package baekjoon.재귀함수;

import java.io.*;

public class P11729 {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		hanoi(n, 1, 3, 2);
		bw.flush();
		bw.close();
	}

	private static void hanoi(int n, int from, int to, int tmp) throws IOException {
		if (n == 1) {
			count++;
			bw.append(from + " " + to + "\n");
			return;
		} else {
			hanoi(n - 1, from, tmp, to);
			bw.append(from + " " + to + "\n");
			count++;
			hanoi(n - 1, tmp, to, from);
		}
	}
}
