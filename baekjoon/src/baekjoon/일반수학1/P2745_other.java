package baekjoon.일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2745_other {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		int[] n = new int[s.length()];
		double result = 0;
		for(int i = 0; i< s.length(); i++) {
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				n[i] = s.charAt(i) - 'A' + 10;
			else
				n[i] = s.charAt(i) - '0';
			result += n[i] * Math.pow(b, n.length - i - 1);
		}
		System.out.println((int)result);
	}
}
