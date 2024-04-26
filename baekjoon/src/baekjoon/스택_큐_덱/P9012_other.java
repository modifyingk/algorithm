package baekjoon.스택_큐_덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class P9012_other {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			Stack<Character> stack = new Stack<>();
			char[] v = br.readLine().toCharArray();
			if(checkVps(stack, v))
				bw.append("YES\n");
			else
				bw.append("NO\n");
		}
		bw.flush();
		bw.close();
	}
	
	private static boolean checkVps(Stack<Character> stack, char[] v) {
		for(int i = 0; i < v.length; i++) {
			if(v[i] == '(' || stack.isEmpty())
				stack.push(v[i]);
			else if(stack.peek() == '(')
				stack.pop();
		}
		if(stack.isEmpty())
			return true;
		else
			return false;
	}
}
