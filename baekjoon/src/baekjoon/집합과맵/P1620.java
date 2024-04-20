package baekjoon.집합과맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 포켓몬 개수
		int m = Integer.parseInt(st.nextToken()); // 문제 개수
		
		Map<String, String> name = new HashMap<>();
		Map<String, String> num = new HashMap<>();
		
		for(int i = 1; i <= n; i++) {
			String poketmon = br.readLine();
			name.put(poketmon, String.valueOf(i));
			num.put(String.valueOf(i), poketmon);
		}
		
		for(int i = 0; i < m; i++) {
			String problem = br.readLine();
			if(name.containsKey(problem))
				bw.append(name.get(problem) + "\n"); // 문자열이 입력되면 번호 출력
			else {
				bw.append(num.get(problem) + "\n"); // 숫자가 입력되면 이름 출력
			}
		}
		bw.flush();
		bw.close();
	}
}
