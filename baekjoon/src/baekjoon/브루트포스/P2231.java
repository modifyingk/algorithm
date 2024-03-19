package baekjoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean isExist = false;
		for(int i = 1; i < n; i++) {
			int sum = i;
			int len = String.valueOf(i).length();
			for(int j = 0; j < len; j++) {
				sum += (String.valueOf(i).charAt(j)) - '0';
			}
			if(sum == n) {
				System.out.println(i);
				isExist = true;
				break;
			}
		}
		if(!isExist)
			System.out.println(0);
	}
}
