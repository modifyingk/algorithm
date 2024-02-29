package baekjoon.약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P2501 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			if(n % i == 0)
				arr.add(i);
		}
		if(arr.size() >= k)
			System.out.println(arr.get(k - 1));
		else
			System.out.println(0);
	}
}
