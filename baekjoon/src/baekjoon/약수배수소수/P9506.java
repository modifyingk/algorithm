package baekjoon.약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P9506 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			ArrayList<Integer> arr = new ArrayList<>();
			String result = "";
			int sum = 0;
			int n = Integer.parseInt(br.readLine());
			if(n == -1)
				break;
			for(int i = 1; i < n; i++) {
				if(n % i == 0) {
					arr.add(i);
					sum += i;
				}
			}
			if(sum == n) {
				result += n + " = ";
				for(int i = 0; i < arr.size() - 1; i++) {
					result += arr.get(i) + " + ";
				}
				result += arr.get(arr.size() - 1);
			}
			else
				result += n + " is NOT perfect.";
			
			System.out.println(result);
		}
	}
}
