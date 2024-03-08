package baekjoon.약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P2581 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		ArrayList<Integer> arr = new ArrayList<>();
		boolean isPrime = false;
		for(int i = m; i <= n; i++) {
			if(i == 1)
				continue;
			for(int j = 2; j <= i; j++) {
				if(i % j == 0 && j != i) {
					isPrime = false;
					break;
				} else {
					isPrime = true;
				}
			}
			if(isPrime)
				arr.add(i);
		}
		if(arr.size() > 0) {
			for(int i = 0; i < arr.size(); i++) {
				sum += arr.get(i);
			}
			System.out.println(sum);
			System.out.println(arr.get(0));
		} else {
			System.out.println(-1);
		}
	}
}