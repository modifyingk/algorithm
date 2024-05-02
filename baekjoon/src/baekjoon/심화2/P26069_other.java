package baekjoon.심화2;

import java.io.*;
import java.util.*;

public class P26069_other {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Set<String> set = new HashSet<>();
		set.add("ChongChong");
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			String b = st.nextToken();
			if(set.contains(a) || set.contains(b)) {
				set.add(a);
				set.add(b);
			}
		}
		System.out.println(set.size());
	}
}
