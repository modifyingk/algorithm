package baekjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P1427_other {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		
		while(n != 0) {
			list.add(n % 10);
			n = n / 10;
		}
		
		Collections.sort(list);
		Collections.reverse(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
	}
	
}
