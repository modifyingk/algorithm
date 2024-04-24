package baekjoon.약수배수소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1929 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long m = Long.parseLong(st.nextToken());
		long n = Long.parseLong(st.nextToken());
		
		for(long i = m; i <= n; i++) {
			boolean isPrime = true;
			if(i == 1)
				continue;
			for(long j = 2; j * j <= i && isPrime; j++) {
				if(i % j == 0) {
					isPrime = false;
				}
			}
			if(isPrime)
				bw.append(i + "\n");
		}
		bw.flush();
		bw.close();
	}

}
