package baekjoon.스택_큐_덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class MyStack {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] stack = new int[1000000];
		int idx = -1;
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int order = Integer.parseInt(st.nextToken());
			switch(order) {
				case 1:
					int x = Integer.parseInt(st.nextToken());
					stack[++idx] = x;
					break;
				case 2:
					if(idx != -1)
						bw.append(pop(stack, idx--) + "\n");
					else
						bw.append(-1 + "\n");
					break;
				case 3:
					bw.append(idx+1 + "\n");
					break;
				case 4:
					if(idx == -1)
						bw.append(1 + "\n");
					else
						bw.append(0 + "\n");
					break;
				case 5:
					if(idx != -1)
						bw.append(stack[idx] + "\n");
					else
						bw.append(-1 + "\n");
					break;
			}
		}
		bw.flush();
		bw.close();
	}
	
	private static int pop(int[] stack, int idx) {
		int pop = stack[idx];
		stack[idx] = 0;
		return pop;
	}
}
