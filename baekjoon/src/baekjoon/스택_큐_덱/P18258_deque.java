package baekjoon.스택_큐_덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Deque;
import java.util.StringTokenizer;

public class P18258_deque {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		Deque<Integer> queue = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			switch (order) {
				case "push":
					int num = Integer.parseInt(st.nextToken());
					queue.offer(num);
					break;
				case "pop":
					if(queue.isEmpty())
						bw.append(-1 + "\n");
					else
						bw.append(queue.pollFirst() + "\n");
					break;
				case "size":
					bw.append(queue.size() + "\n");
					break;
				case "empty":
					if(queue.isEmpty())
						bw.append(1 + "\n");
					else
						bw.append(0 + "\n");
					break;
				case "front":
					if(queue.isEmpty())
						bw.append(-1 + "\n");
					else
						bw.append(queue.peekFirst() + "\n");
					break;
				case "back":
					if(queue.isEmpty())
						bw.append(-1 + "\n");
					else {
						bw.append(queue.peekLast() + "\n");
					}
					break;
			}
		}
		bw.flush();
		bw.close();
	}
}
