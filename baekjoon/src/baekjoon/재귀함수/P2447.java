package baekjoon.재귀함수;

import java.io.*;

public class P2447 {
	
	static char[][] ch;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		ch = new char[n][n];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				ch[i][j] = '*';
			}
		}
		
		for(int i = 1; i < n; i+=3) {
			for(int j = 1; j < n; j+=3) {
				ch[i][j] = ' ';
			}
		}
		
		star(0, 0, n);
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				bw.append(ch[i][j]);
			}
			bw.append("\n");
		}
		bw.flush();
		bw.close();
	}
	
	private static void star(int row, int col, int len) {
		if(len == 1)
			return;
		
		for(int i = row + len / 3; i < row + (len / 3) * 2; i++) {
			for(int j = col + len / 3; j < col + (len / 3) * 2; j++) {
				ch[i][j] = ' ';
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				star(row, col + (len / 3) * j, len / 3);
				star(row + (len / 3) * i, col + (len / 3) * j, len / 3);
			}
		}
		
	}
}
