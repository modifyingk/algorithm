package baekjoon.문자와문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] arr = new int[26];
		for(int i = 0; i < 26; i++) {
			arr[i] = -1;
		}
		for(int i = 0; i < s.length(); i++) {
			if(arr[s.charAt(i) - 'a'] == -1)
				arr[s.charAt(i) - 'a'] = i;
		}
		for(int i = 0; i < 26; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
