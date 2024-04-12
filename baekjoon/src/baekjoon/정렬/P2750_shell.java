package baekjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2750_shell {
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		// input
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		// shell sort
		for(int h = n/2; h > 0; h /= 2) {
			for(int i = h; i < n; i++) {
				int j;
				int  tmp = arr[i];
				for(j = i-h; j >=0 && arr[j] > tmp; j-= h) {
					arr[j + h] = arr[j];
				}
				arr[j + h] = tmp;
			}
		}
		
		// output
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}
