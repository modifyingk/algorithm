package baekjoon.집합과맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class P7785 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>(); 
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String log = st.nextToken();
			if(log.equals("enter"))
				map.put(name, 1);
			else
				map.remove(name);
		}
		String[] person = new String[map.size()];
		int j = 0;
		for (String key : map.keySet()) {
			person[j] = key;
			j++;
		}
		Arrays.sort(person, (a, b) -> b.compareTo(a));

		for(int i = 0; i < person.length; i++) {
			bw.append(person[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
}
