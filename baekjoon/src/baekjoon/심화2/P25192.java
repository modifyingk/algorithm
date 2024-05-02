package baekjoon.심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P25192 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		int count = 0;
		for(int i = 0; i < n; i++) {
			String chat = br.readLine();
			if(chat.equals("ENTER")) {
				count += set.size();
				set.clear();
			} else
				set.add(chat);
		}
		System.out.println(count + set.size());
	}
}
