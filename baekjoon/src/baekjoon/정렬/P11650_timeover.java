package baekjoon.정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P11650_timeover {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - 1 - i; j++) {
				if(arr[i+1][0] < arr[i][0])
					swap(arr, i, i+1);
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - 1 - i; j++) {
				if(arr[i+1][0] == arr[i][0]) {
					if(arr[i+1][1] < arr[i][1])
						swap(arr, i, i+1);
				}
			}
		}
		for(int i = 0; i < n; i++) {
			bw.append(arr[i][0] + " " + arr[i][1] + "\n");
		}
		bw.flush();
		bw.close();
	}
	
	public static void swap(int[][] a, int i, int j) {
		int x = a[i][0];
		int y = a[i][1];
		
		a[i][0] = a[j][0];
		a[i][1] = a[j][1];
		
		a[j][0] = x;
		a[j][1] = y;
	}
}
