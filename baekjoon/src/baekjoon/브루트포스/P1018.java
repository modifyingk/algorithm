package baekjoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		char[][] sample1 = {{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
						{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
						{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
						{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
						{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
						{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
						{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
						{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}};
		
		char[][] sample2 = {{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
						{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
						{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
						{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
						{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
						{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
						{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
						{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}};
		
		char[][] arr = new char[m][n];
		for(int i = 0; i < m; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		int p = 0;
		int min = 100000;
		while(p + 7 < m) {
			int q = 0;
			while(q + 7 < n) {
				int cnt1 = 0; int cnt2 = 0;
				for(int i = p; i < p + 8; i++) {
					for(int j = q; j < q + 8; j++) {
						if(sample1[i-p][j-q] != arr[i][j])
							cnt1++;
						if(sample2[i-p][j-q] != arr[i][j])
							cnt2++;
					}
				}
				min = Math.min(Math.min(cnt1, cnt2), min);
				q++;
			}
			p++;
		}
		System.out.println(min);
	}
}
