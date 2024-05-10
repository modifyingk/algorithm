package baekjoon.재귀함수;

import java.io.*;

public class P4779 {
	
	static char[] ch;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str;
		while((str = br.readLine()) != null) {
			int n = Integer.parseInt(str);
			int len = (int) Math.pow(3, n);
			ch = new char[len];
			
			for(int i = 0; i < len; i++) {
				ch[i] = '-';
			}
			
			cantorian(0, len);
			for(int i = 0; i < ch.length; i++) {
				bw.append(ch[i]);
			}
			bw.append("\n");
			bw.flush();
		}
	}
	
	private static void cantorian(int start, int len) {
		if(len == 1)
			return;

		for(int i = start + len / 3; i < start + 2 * len / 3; i++) {
			ch[i] = ' ';
		}
		
		cantorian(start, len / 3);
		cantorian(start + 2 * len / 3, len / 3);
		
	}
}
