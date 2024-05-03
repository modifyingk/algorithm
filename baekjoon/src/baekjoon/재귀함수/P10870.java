package baekjoon.재귀함수;

import java.io.*;

public class P10870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(fibonacci(n));
	}
	
	private static int fibonacci(int n) {
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		return fibonacci(n-2) + fibonacci(n-1);
	}
}
