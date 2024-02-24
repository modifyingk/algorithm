package baekjoon.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toUpperCase().toCharArray();
		char[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'F', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int[] n = new int[26];
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < 26; j++) {
				if(str[i] == ch[j])
					n[j]++;
			}
		}
		int maxIdx = 0;
		for(int i = 0; i < n.length; i++) {
			if(n[maxIdx] < n[i])
				maxIdx = i;
		}
		int max = n[maxIdx];
		int cnt = 0;
		for(int i = 0; i < n.length; i++) {
			if(n[i] == max)
				cnt++;
		}
		if(cnt > 1)
			System.out.println("?");
		else
			System.out.println(ch[maxIdx]);
	}
}
