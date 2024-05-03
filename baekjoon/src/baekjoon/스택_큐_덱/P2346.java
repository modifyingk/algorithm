package baekjoon.스택_큐_덱;

import java.io.*;
import java.util.*;

public class P2346 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Deque<int[]> dq = new ArrayDeque<>();
		
		int n = Integer.parseInt(br.readLine()); // 풍선 개수
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			int paper = Integer.parseInt(st.nextToken()); // 종이에 적힌 값
			int[] arr = {i, paper};
			dq.add(arr);
		}
		
		int[] next = dq.pollFirst(); // 첫번째 풍선 터뜨림
		bw.append(next[0] + " ");
		
		while(!dq.isEmpty()) {
			if(next[1] < 0) {
				for(int i = 0; i < Math.abs(next[1]) - 1; i++) {
					dq.addFirst(dq.pollLast());
				}
				next = dq.pollLast();
				bw.append(next[0] + " ");
			} else {
				for(int i = 0; i < next[1] - 1; i++) {
					dq.addLast(dq.pollFirst());
				}
				next = dq.pollFirst();
				bw.append(next[0] + " ");
			}
		}
		
		bw.flush();
		bw.close();
	}
}
