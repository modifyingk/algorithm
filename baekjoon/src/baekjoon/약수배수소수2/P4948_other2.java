package baekjoon.약수배수소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4948_other2 {
	private static final int SIZE = 123456;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[2 * SIZE + 1];
		for(int i = 2; i < arr.length; i++) {
			arr[i] = i;
		}
		
		for(int i = 2; i <= Math.sqrt(2 * SIZE); i++) {
			if(arr[i] == 0)
				continue;
			for(int j = i + i; j < arr.length; j += i) {
				arr[j] = 0;
			}
		}
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0)
				break;
			int count = 0;
			for(int i = n+1; i <= 2 * n; i++) {
				if(arr[i] != 0)
					count++;
			}
			System.out.println(count);
		}
	}
}
