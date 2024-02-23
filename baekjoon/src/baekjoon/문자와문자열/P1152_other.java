package baekjoon.문자와문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1152_other {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().trim();
		if(s.equals("")) {
			System.out.println(0);
		} else {
			String[] word = s.split(" ");
			System.out.println(word.length);
		}
	}
}
