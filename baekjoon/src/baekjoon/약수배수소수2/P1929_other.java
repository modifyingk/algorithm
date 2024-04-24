package baekjoon.약수배수소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1929_other {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		// 배열 초기화
		int[] arr = new int[n+1];
		for(int i = 2; i <= n; i++) {
			arr[i] = i;
		}

		// i의 배수인 경우 0 저장
		for(int i = 2; i < Math.sqrt(n); i++) {
			if(arr[i] == 0)
				continue;
			for(int j = i+i; j <= n; j = j+i) {
				arr[j] = 0;
			}
		}
		
		// 출력
		for(int i = m; i <= n; i++) {
			if(arr[i] != 0)
				bw.append(arr[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
	
}
