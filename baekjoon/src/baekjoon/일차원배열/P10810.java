package baekjoon.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10810 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 바구니 개수
		int m = Integer.parseInt(st.nextToken()); // 몇 번
		int[] arr = new int[n];
		int i, j, k;
		for(int a = 0; a < m; a++) {
			st = new StringTokenizer(br.readLine());
			i = Integer.parseInt(st.nextToken());
			j = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			for(int b = i - 1; b < j; b++) {
				arr[b] = k;
			}
 		}
		for(int a = 0; a < n; a++) {
			System.out.print(arr[a] + " ");
		}
	}
}
