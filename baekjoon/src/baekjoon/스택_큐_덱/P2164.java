package baekjoon.스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P2164 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			queue.add(i);
		}
		while(queue.size() > 1) {
			queue.poll(); // top 버리기
			
			if(queue.size() == 1)
				break;
			int top = queue.peek(); // top 제일 아래로
			queue.poll();
			queue.add(top);
		}
		System.out.println(queue.peek());
	}
}
