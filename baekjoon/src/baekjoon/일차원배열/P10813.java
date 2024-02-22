package baekjoon.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10813 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 바구니 개수
		int m = Integer.parseInt(st.nextToken()); // 몇 번
		int[] arr = new int[n];
		for(int k = 0; k < n; k++) {
			arr[k] = k + 1;
		}
		int i, j;
		for(int k = 0; k < m; k++) {
			st = new StringTokenizer(br.readLine());
			i = Integer.parseInt(st.nextToken());
			j = Integer.parseInt(st.nextToken());
			int tmp = arr[i - 1];
			arr[i - 1] = arr[j - 1];
			arr[j - 1] = tmp;
 		}
		for(int k = 0; k < n; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
