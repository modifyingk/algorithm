package baekjoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1018_other {
	static boolean[][] board;
	static int min;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		board = new boolean[m][n];
		min = Integer.MAX_VALUE;
		
		for(int i = 0; i < m; i++) {
			String str = br.readLine();
			for(int j = 0; j < n; j++) {
				if(str.charAt(j) == 'B')
					board[i][j] = true;
				else
					board[i][j] = false;
			}
		}
		
		for(int i = 0; i <= m - 8; i++) {
			for(int j = 0; j <= n - 8; j++) {
				checkBoard(i, j);
			}
		}
		System.out.println(min);
	}

	private static void checkBoard(int p, int q) {
		int cnt = 0;
		boolean check = true;
		for(int i = p; i < p + 8; i++) {
			for(int j = q; j < q + 8; j++) {
				if(check != board[i][j])
					cnt++;
				check = !check;
			}
			check = !check;
		}
		
		cnt = Math.min(cnt, 64-cnt);
		min = Math.min(cnt, min);
		
	}
}
