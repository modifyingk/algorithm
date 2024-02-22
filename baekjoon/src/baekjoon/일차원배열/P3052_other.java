package baekjoon.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class P3052_other {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> mod = new HashSet<>();
		for(int i = 0; i < 10; i++) {
			mod.add((Integer.parseInt(br.readLine())) % 42);
		}
		System.out.println(mod.size());
	}
}
