package baekjoon.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			int[] num = new int[26];
			for(int j = 0; j < s.length(); j++) {
				num[s.charAt(j) - 'a']++;
			}
			boolean chk = false;
			for(int j = 0; j < 26; j++) {
				String g = "";
				if(num[j] <= 1)
					chk = true;
				else {
					for(int k = 0; k < num[j]; k++) {
						g += (char)(j + 'a');
					}
					if(s.contains(g))
						chk = true;
					else {
						chk = false;
						break;
					}
				}
			}
			if(chk) count++;
		}
		System.out.println(count);
	}
}
