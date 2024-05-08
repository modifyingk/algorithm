package baekjoon.동적계획법1;

import java.util.*;
import java.io.*;

public class P24416 {
	static int cnt1 = 1;
	static int cnt2 = 0;

	static ArrayList<Integer> arr = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		fib(n); fibonacci(n);
		bw.append(cnt1 + " " + cnt2);
		bw.flush();
		bw.close();
	}
	
	private static int fib(int n) {
		if(n == 1 || n == 2)
			return 1;
		else {
			cnt1++;
			return (fib(n-1) + fib(n-2));
		}
	}
	
	private static int fibonacci(int n) {
		arr.add(1);
		arr.add(1);
		for(int i = 3; i <= n; i++) {
			arr.add(arr.get(i - 2) + arr.get(i - 3));
			cnt2++;
		}
		return arr.get(n-1);
	}
}
