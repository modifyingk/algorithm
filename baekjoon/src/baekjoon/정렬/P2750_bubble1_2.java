package baekjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2750_bubble1_2 {
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		// input
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// bubble sort
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					swap(j, j+1);
				}
			}
		}
		
		// output
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void swap(int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
}
