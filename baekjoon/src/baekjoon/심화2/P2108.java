package baekjoon.심화2;

import java.io.*;
import java.util.*;

public class P2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		double sum = 0;
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
			sum += num;
		}
		
		int[] count = new int[8001];
		for(int i = 0; i < arr.length; i++) {
			count[arr[i] + 4000]++;
		}
		int max = 0;
		for(int i = 0; i < count.length; i++) {
			max = Math.max(max, count[i]);
		}
		int th = 0;
		int mode = 0;
		for(int i = 0; i < count.length; i++) {
			if(count[i] == max) {
				mode = i - 4000;
				th++;
			}
			if(th == 2)
				break;
		}
		
		Arrays.sort(arr);
		bw.append(Math.round(sum / n) + "\n"); // 산술평균
		bw.append(arr[n / 2] + "\n"); // 중앙값
		bw.append(mode + "\n"); // 최빈값
		bw.append(arr[n-1] - arr[0] + "\n"); // 범위
		bw.flush();
		bw.close();
	}
}
