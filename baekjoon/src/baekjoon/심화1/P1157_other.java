package baekjoon.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1157_other {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] ch = br.readLine().toUpperCase().toCharArray();
		int[] n = new int[26];
		for(int i = 0 ; i < ch.length; i++) {
			n[ch[i] - 'A']++;
		}
		int max = 0;
		char result = '?';
		for(int i = 0; i < n.length; i++) {
			if(max < n[i]) {
				max = n[i];
				result = (char) (i + 'A');
			} else if(max == n[i]) {
				result = '?';
			}
		}
		System.out.println(result);
	}
}
