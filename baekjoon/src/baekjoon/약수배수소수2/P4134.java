package baekjoon.약수배수소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P4134 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			long n = Long.parseLong(br.readLine());
			boolean isPrime = false;
			while(!isPrime) {
				isPrime = true;
				if(n < 2)
					isPrime = false;
				// n 보다 크거나 같은 소수 중 가장 작은 소수 찾기
				for(long j = 2; j <= Math.sqrt(n); j++) {
					if(n % j == 0) { // 소수 아님
						isPrime = false;
						break;
					}
				}
				if(isPrime) {
					bw.append(n + "\n");
				}
				n++;
			}
		}
		
		bw.flush();
		bw.close();
	}

}
