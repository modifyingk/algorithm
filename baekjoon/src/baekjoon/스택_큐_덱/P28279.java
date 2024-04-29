package baekjoon.스택_큐_덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P28279 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> dq = new LinkedList<>();
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int order = Integer.parseInt(st.nextToken());
			switch(order) {
				case 1:
					int x1 = Integer.parseInt(st.nextToken());
					dq.offerFirst(x1);
					break;
				case 2:
					int x2 = Integer.parseInt(st.nextToken());
					dq.offerLast(x2);
					break;
				case 3:
					if(dq.isEmpty())
						bw.append(-1 + "\n");
					else
						bw.append(dq.pollFirst() + "\n");
					break;
				case 4:
					if(dq.isEmpty())
						bw.append(-1 + "\n");
					else
						bw.append(dq.pollLast() + "\n");
					break;
				case 5:
					bw.append(dq.size() + "\n");
					break;
				case 6:
					if(dq.isEmpty())
						bw.append(1 + "\n");
					else
						bw.append(0 + "\n");
					break;
				case 7:
					if(dq.isEmpty())
						bw.append(-1 + "\n");
					else
						bw.append(dq.peekFirst() + "\n");
					break;
				case 8:
					if(dq.isEmpty())
						bw.append(-1 + "\n");
					else
						bw.append(dq.peekLast() + "\n");
					break;
			}
		}
		bw.flush();
		bw.close();
	}
}
