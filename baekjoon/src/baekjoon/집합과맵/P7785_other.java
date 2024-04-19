package baekjoon.집합과맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class P7785_other {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String log = st.nextToken();
			if(log.equals("enter"))
				set.add(name);
			else
				set.remove(name);
		}
		ArrayList<String> arr = new ArrayList<>(set);
		Collections.sort(arr, Collections.reverseOrder());
		for(int i = 0; i < arr.size(); i++) {
			bw.append(arr.get(i) + " \n");
		}
		bw.flush();
		bw.close();
	}
}
