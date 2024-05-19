package baekjoon.동적계획법1;

import java.io.*;
import java.util.StringTokenizer;

public class P1912 {
	
	static int[] arr;
	static Integer[] memory;
	static int max;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		arr = new int[n];
		memory = new Integer[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		memory[0] = arr[0];
		max = arr[0];
		
		calc(n-1);
		System.out.println(max);
	}
	
	private static int calc(int n) {
		if(memory[n] == null) {
			memory[n] = Math.max(calc(n-1) + arr[n], arr[n]);
			max = Math.max(memory[n], max);
		}
		return memory[n];
	}
}
