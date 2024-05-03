package baekjoon.스택_큐_덱;

import java.io.*;
import java.util.*;

public class P12789 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int[] pop = new int[n];
		int idx = 0;
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(stack.isEmpty() || num < stack.peek())
				stack.push(num);
			else {
				while(!stack.isEmpty() && stack.peek() < num)
					pop[idx++] = stack.pop();
				stack.push(num);
			}
		}
		int len = stack.size();
		for(int i = 0; i < len; i++) {
			pop[idx++] = stack.pop();
		}
		
		boolean check = false;
		for(int i = 0; i < pop.length - 1; i++) {
			if(pop[i+1] < pop[i]) {
				check = false;
				break;
			} else {
				check = true;
			}
		}
		if(check) System.out.println("Nice");
		else System.out.println("Sad");
	}
}
