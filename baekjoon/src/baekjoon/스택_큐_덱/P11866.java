package baekjoon.스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class P11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		// queue initialize
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			queue.add(i);
		}
		
		// remove k-th
		StringJoiner sj = new StringJoiner(", ", "<", ">");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < k-1; j++) {
				int p = queue.poll();
				queue.add(p);
			}
			sj.add(queue.poll() + "");
		}
		System.out.println(sj.toString());
	}
}
