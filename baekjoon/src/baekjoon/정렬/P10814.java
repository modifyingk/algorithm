package baekjoon.정렬;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P10814 {
	
	public class Member {
		private int age;
		private String name;
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Member> list = new ArrayList<>();
		
		StringTokenizer st;
		P10814 p = new P10814();
		P10814.Member member;
		
		// input
		for(int i = 0; i < n; i++) {
			member = p.new Member();
			st = new StringTokenizer(br.readLine());
			member.setAge(Integer.parseInt(st.nextToken()));
			member.setName(st.nextToken());
			list.add(member);
		}
		
		// sort
		Collections.sort(list, (a, b) -> a.getAge() - b.getAge());
		
		// output
		for(int i = 0; i < n; i++) {
			bw.append(list.get(i).getAge() + " " + list.get(i).getName() + "\n");
		}
		bw.flush();
		bw.close();
	}
}
