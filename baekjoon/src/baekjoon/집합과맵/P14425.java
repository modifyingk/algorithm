package baekjoon.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

public class P14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int count = 0;
		
		Map<String, Integer> s = new HashMap<>(); 
		for(int i = 0; i < n; i++) {
			s.put(br.readLine(), 1);
		}
		
		for(int i = 0; i < m; i++) {
			String str = br.readLine();
			if(s.containsKey(str))
				count++;
		}
		
		System.out.println(count);
	}
}
