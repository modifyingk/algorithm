package baekjoon.심화2;

import java.io.*;
import java.util.*;

public class P26069 {
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
			Iterator<String> iterSet = set.iterator();
			String addName = "";
			while(iterSet.hasNext()) {
				String dancer = iterSet.next();
				if(a.equals(dancer)) {
					addName = b;
					break;
				}
				else if(b.equals(dancer)) {
					addName = a;
					break;
				}
			}
			if(!addName.equals(""))
				set.add(addName);
		}
		System.out.println(set.size());
	}
}
