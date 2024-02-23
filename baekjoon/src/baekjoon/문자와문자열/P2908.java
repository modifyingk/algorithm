package baekjoon.문자와문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] num = new int[2];
		for(int i = 0; i < 2; i++) {
			char[] ch = st.nextToken().toCharArray();
			String str = "";
			for(int j = 2; j >= 0; j--) {
				str += ch[j];
			}
			num[i] = Integer.parseInt(str);
		}
		System.out.println(Math.max(num[0], num[1]));
	}
}
