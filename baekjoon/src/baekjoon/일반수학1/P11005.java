package baekjoon.일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11005 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		String result = "";
		while(n > 0) {
			int mod = n % b;
			n  = n / b;
			if(mod > 9)
				result += (char)(mod + 'A' - 10);
			else
				result += mod;
		}
		for(int i = result.length() - 1; i >= 0; i--) {
			System.out.print(result.charAt(i));
		}
	}
}
