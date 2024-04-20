package baekjoon.집합과맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P1620_other {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 포켓몬 개수
		int m = Integer.parseInt(st.nextToken()); // 문제 개수
		
		String[] num = new String[n];
		Map<String, String> name = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			String poketmon = br.readLine();
			name.put(poketmon, String.valueOf(i+1));
			num[i] = poketmon;
		}
		
		for(int i = 0; i < m; i++) {
			String problem = br.readLine();
			if(!Character.isDigit(problem.charAt(0)))
				bw.append(name.get(problem) + "\n"); // 문자열이 입력되면 번호 출력
			else {
				bw.append(num[Integer.parseInt(problem) - 1] + "\n"); // 숫자가 입력되면 이름 출력
			}
		}
		bw.flush();
		bw.close();
	}
}
