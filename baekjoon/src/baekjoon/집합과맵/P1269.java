package baekjoon.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P1269 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int aNum = Integer.parseInt(st.nextToken());
		int bNum = Integer.parseInt(st.nextToken());
		Set<Integer> set = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < aNum; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < bNum; i++) {
			int b = Integer.parseInt(st.nextToken());
			if(set.contains(b)) // 공통되면 제거
				set.remove(b);
			else // 공통되지 않으면 추가
				set.add(b);
		}
		System.out.println(set.size());
	}
}
