package baekjoon.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] cStr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		for(int i = 0; i < cStr.length; i++) {
			s = s.replace(cStr[i], "0");
		}
		System.out.println(s.length());
	}

}
