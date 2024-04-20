package baekjoon.집합과맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class P1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 듣도 못한 사람 수
		int m = Integer.parseInt(st.nextToken()); // 보도 못한 사람 수
		
		Set<String> noHear = new HashSet<>();
		Set<String> noSee = new HashSet<>();
		for(int i = 0; i < n; i++) { // 듣도 못한 사람
			noHear.add(br.readLine());
		}
		for(int i = 0; i < m; i++) { // 보도 못한 사람
			noSee.add(br.readLine());
		}
		
		ArrayList<String> list = new ArrayList<>(); // 듣보잡
		
		Iterator<String> iterHear = noHear.iterator();
		while(iterHear.hasNext()) {
			String name = iterHear.next();
			if(noSee.contains(name)) {
				list.add(name);
			}
		}
		
		Collections.sort(list); // 듣보잡 정렬
		
		bw.append(list.size() + "\n"); // 듣보잡 수
		for(String name : list) {
			bw.append(name + "\n"); // 듣보잡 명단
		}
		
		bw.flush();
		bw.close();
	}
}
