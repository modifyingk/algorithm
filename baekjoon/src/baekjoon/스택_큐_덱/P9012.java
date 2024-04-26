package baekjoon.스택_큐_덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class P9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			Stack<Character> stack = new Stack<>();
			char[] v = br.readLine().toCharArray();
			for(int j = 0; j < v.length; j++) {
				if(v[j] == '(') // '(' 인 경우 stack에 push
					stack.push(v[j]);
				else { // ')' 인 경우
					if(stack.isEmpty()) // stack이 비어있으면 ')' push
						stack.push(v[j]);
					else {
						if(stack.peek() != ')') // top이 '('인 경우만 pop
							stack.pop();
					}
				}
			}
			if(stack.isEmpty()) // stack이 비어있으면 vps
				bw.append("YES\n");
			else
				bw.append("NO\n");
		}
		bw.flush();
		bw.close();
	}
}
