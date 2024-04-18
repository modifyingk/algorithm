package baekjoon.정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int[] arr2 = arr.clone();
		Arrays.sort(arr2);

		HashMap<Integer, Integer> map = new HashMap<>();
		int cnt = 0;
		for(int j = 0; j < arr2.length; j++) {
			if(map.get(arr2[j]) == null)
				map.put(arr2[j], j-cnt);
			else
				cnt++;
		}
		
		for(int i = 0; i < n; i++) {
			bw.append(map.get(arr[i]) + " ");
		}
		bw.flush();
		bw.close();
	}
}
