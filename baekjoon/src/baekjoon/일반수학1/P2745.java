package baekjoon.일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.StringTokenizer;

public class P2745 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] ch = (st.nextToken().toCharArray());
		int b = Integer.parseInt(st.nextToken());
		int[] n = new int[ch.length];
		double result = 0;
		for(int i = 0; i< ch.length; i++) {
			if(ch[i] >= 'A' && ch[i] <= 'Z')
				n[i] = ch[i] - 'A' + 10;
			else
				n[i] = ch[i] - '0';
			result += n[i] * Math.pow(b, n.length - i - 1);
		}
		NumberFormat fm = NumberFormat.getInstance();
		fm.setGroupingUsed(false);
		System.out.println(fm.format(result));
	}
}
