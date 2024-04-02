package baekjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2750_counting {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		// input
		int max = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max < arr[i]) max = arr[i];
		}

		// counting sort
		int[] count = new int[max];
		for(int i = 0; i < n; i++) {
			count[arr[i] - 1]++;
		}
		
		// output
		for(int i = 0; i < count.length; i++) {
			for(int j = 0; j < count[i]; j++) {
				System.out.println(i+1);
			}
		}
	}
}
