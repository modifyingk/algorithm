package baekjoon.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class P114798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		Set<String> set = new HashSet<>();
		
		int len = 1;
		while(len <= s.length()) {
			for(int i = 0; i < s.length() - len + 1; i++) { // 시작점
				String partStr = s.substring(i, i + len);
				set.add(partStr);
			}
			len++;
		}
		System.out.println(set.size());
	}
}
