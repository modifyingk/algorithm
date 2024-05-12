package baekjoon.동적계획법1;

import java.io.*;
import java.util.*;

public class P9184 {
	static int[][][] memory = new int[21][21][21];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		while(true) {
			String str = br.readLine();
			if(str.equals("-1 -1 -1"))
				break;
			
			st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			bw.append("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c) + "\n");
			bw.flush();
		}
		bw.close();
	}
	
	private static int w(int a, int b, int c) {
		if(a >= 0 && a <= 20 && b >= 0 && b <= 20 && c >= 0 && c <= 20 && memory[a][b][c] != 0)
			return memory[a][b][c];

		if(a <= 0 || b <= 0 || c <= 0)
			return 1;
		else if(a > 20 || b > 20 || c > 20)
			return memory[20][20][20] = w(20, 20, 20);
		else if(a < b && b < c)
			return memory[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
		else
			return memory[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
	}
}
