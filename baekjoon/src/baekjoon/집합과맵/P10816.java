package baekjoon.집합과맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Map<Integer, Integer> card = new HashMap<>();
		StringTokenizer st;
		
		// 상근이 카드 입력
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(card.containsKey(num)) // 이미 있으면 개수 ++
				card.put(num, card.get(num) + 1);
			else
				card.put(num, 1);
		}
		
		// 카드 개수 체크
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) { // 숫자 카드
			int num = Integer.parseInt(st.nextToken());
			if(card.containsKey(num))
				bw.append(card.get(num) + " ");
			else
				bw.append(0 + " ");
		}
		bw.flush();
		bw.close();
	}
}
