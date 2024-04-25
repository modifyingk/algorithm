package baekjoon.약수배수소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P17103_other {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		int arr[] = new int[1000001];
		for(int i = 3; i < 1000001; i++) {
			if(i % 2 != 0)
				arr[i] = i;
		}
		for(int i = 3; i <= Math.sqrt(1000000); i+=2) {
			if(arr[i] == 0)
				continue;
			for(int j = i+i; j <= 1000000; j+=i) {
				arr[j] = 0;
			}
		}
		
		for(int i = 0; i < t; i++) {
			int count = 0;
			int n = Integer.parseInt(br.readLine());
			if(n == 4) {
				bw.append(1 + "\n");
				continue;
			}
			for(int j = 3; j <= n / 2; j+=2){ // 홀수만
				if(arr[j] != 0 && arr[n-j] != 0) {
						count++;
				}
			}
			bw.append(count + "\n");
		}
		bw.flush();
		bw.close();
	}
}
