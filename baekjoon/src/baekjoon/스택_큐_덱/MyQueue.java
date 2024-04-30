package baekjoon.스택_큐_덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class MyQueue {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] queue = new int[2000000];
		int front = 0;
		int back = -1;
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			switch(order) {
				case "push":
					int x = Integer.parseInt(st.nextToken());
					queue[++back] = x;
					break;
				case "pop":
					if(back - front + 1 == 0)
						bw.append(-1 + "\n");
					else
						bw.append(pop(queue, front++) + " \n");
					break;
				case "size":
					bw.append(back - front + 1 + "\n");
					break;
				case "empty":
					if(back - front + 1 == 0)
						bw.append(1 + "\n");
					else
						bw.append(0 + "\n");
					break;
				case "front":
					if(back - front + 1 == 0)
						bw.append(-1 + "\n");
					else
						bw.append(queue[front] + " \n");
					break;
				case "back":
					if(back - front + 1 == 0)
						bw.append(-1 + "\n");
					else
						bw.append(queue[back] + " \n");
					break;
			}
		}
		bw.flush();
		bw.close();
	}

	private static int pop(int[] queue, int front) {
		int pop = queue[front];
		queue[front] = 0;
		return pop;
	}
	
}
