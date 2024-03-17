package baekjoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] a = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		for(int i = 0; i < n-2; i++) {
			for(int j = i+1; j < n-1; j++) {
				for(int k = j+1; k < n; k++) {
					int tmp = a[i] + a[j] + a[k];
					if(tmp <= m) {
						max = Math.max(max, tmp);
					}
				}
			}
		}
		System.out.println(max);
	}
}
