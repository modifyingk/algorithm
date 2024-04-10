package baekjoon.정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] count = new int[10000];

		for(int i = 0; i < n; i++) {
			count[Integer.parseInt(br.readLine()) - 1]++;
		}
		
		// 출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i < 10000; i++) {
			for(int j = 0; j < count[i]; j++) {
				bw.append(i + 1 + "\n");
			}
		}
		bw.flush();
		bw.close();
	}

}
