package baekjoon.시간복잡도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P24313 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a1 = Integer.parseInt(st.nextToken());
		int a0 = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		int n0 = Integer.parseInt(br.readLine());
		
		int result = 1;

		for(int n = n0; n <= 100; n++) {
			int fn = a1 * n + a0;
			int gn = n;
			if(fn > c * gn) {
				result = 0;
				break;
			}
		}
		
		System.out.println(result);
	}
}
