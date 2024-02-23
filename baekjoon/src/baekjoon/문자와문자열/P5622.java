package baekjoon.문자와문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] ch = br.readLine().toCharArray();
		int time = 0;
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == 'A' || ch[i] == 'B' || ch[i] == 'C')
				time += 3;
			else if(ch[i] == 'D' || ch[i] == 'E' || ch[i] == 'F')
				time += 4;
			else if(ch[i] == 'G' || ch[i] == 'H' || ch[i] == 'I')
				time += 5;
			else if(ch[i] == 'J' || ch[i] == 'K' || ch[i] == 'L')
				time += 6;
			else if(ch[i] == 'M' || ch[i] == 'N' || ch[i] == 'O')
				time += 7;
			else if(ch[i] == 'P' || ch[i] == 'Q' || ch[i] == 'R' || ch[i] == 'S')
				time += 8;
			else if(ch[i] == 'T' || ch[i] == 'U' || ch[i] == 'V')
				time += 9;
			else if(ch[i] == 'W' || ch[i] == 'X' || ch[i] == 'Y' || ch[i] == 'Z')
				time += 10;
		}
		System.out.println(time);
	}
}
