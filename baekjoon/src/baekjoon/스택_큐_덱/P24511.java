package baekjoon.스택_큐_덱;

import java.io.*;
import java.util.*;

public class P24511 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		Deque<Integer> queue = new LinkedList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int b = Integer.parseInt(st.nextToken());
			if(a[i] == 0) {
				queue.offerLast(b);
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int add = Integer.parseInt(st.nextToken());
			int pop = add;
			if(!queue.isEmpty()) {
				queue.offerFirst(add);
				pop = queue.pollLast();
			}
			bw.append(pop + " ");
		}
		bw.flush();
		bw.close();
	}
}
