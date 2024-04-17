package baekjoon.정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		// input (중복 제거)
		Set<String> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			set.add(br.readLine());
		}
		
		String[] str = new String[set.size()];
		Iterator<String> iterSet = set.iterator();
		int i = 0;
		while(iterSet.hasNext()) {
			str[i] = iterSet.next();
			i++;
		}
		
		// sort
		Arrays.sort(str, (a, b) -> a.length() == b.length() ? a.compareTo(b) : a.length() - b.length());
		
		// output
		for(int j = 0; j < str.length; j++) {
			bw.append(str[j] + "\n");
		}
		bw.flush();
		bw.close();
	}
}
