package baekjoon.약수배수소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1934_timeover {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int result = calc(a, b);
			bw.append(result + "\n");
		}
		bw.flush();
		bw.close();
	}

	private static int calc(int a, int b) {
		int max = a * b;
		int arr1[] = new int[max / a];
		int arr2[] = new int[max / b];
		int i = 1;
		while(i <= arr1.length || i <= arr2.length) {
			if(i <= arr1.length)
				arr1[i - 1] = a * i;
			if(i <= arr2.length)
				arr2[i - 1] = b * i;
			i++;
		}
		boolean chk = false;
		for(int j = 0; j < arr1.length; j++) {
			for(int k = 0; k < arr2.length; k++) {
				if(arr1[j] == arr2[k]) {
					max = arr1[j];
					chk = true;
					break;
				}
			}
			if(chk)
				break;
		}
		return max;
	}
}
