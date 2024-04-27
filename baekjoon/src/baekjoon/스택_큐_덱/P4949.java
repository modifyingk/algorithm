package baekjoon.스택_큐_덱;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.io.IOException;;

public class P4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String input = br.readLine();
			if(input.equals("."))
				break;
			
			Stack<Character> stack = new Stack<>();
			for(int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);
				
				if(ch == '(' || ch == '[')
					stack.push(ch);
				else if(ch == ')' || ch == ']') {
					if(stack.isEmpty())
						stack.push(ch);
					else {
						if(ch == ')' && stack.peek() == '(')
							stack.pop();
						else if(ch == ']' && stack.peek() == '[')
							stack.pop();
						else
							stack.push(ch);
					}
				}
			}
			
			if(stack.isEmpty())
				bw.append("yes\n");
			else
				bw.append("no\n");
		}
		bw.flush();
		bw.close();
	}
}
