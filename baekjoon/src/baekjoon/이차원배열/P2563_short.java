package baekjoon.이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2563_short {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[100][100];
		int area = 0;
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for(int j = x; j < x+10; j++) {
				for(int k = y; k < y+10; k++) {
					if(arr[j][k] == 0) {
						arr[j][k] = 1;
						area++;
					}
				}
			}
		}
		System.out.println(area);
	}
}
