package baekjoon.심화2;

import java.io.*;
import java.util.*;

public class P20920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			String str =  br.readLine();
			if(str.length() < m)
				continue;
			map.put(str, map.getOrDefault(str, 0) + 1);
		}

		Word[] words = new Word[map.size()];
		int idx = 0;
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			words[idx++] = new Word(entry.getKey(), entry.getValue());
		}
		
		Arrays.sort(words, (a, b) -> {
			if(a.getNum() != b.getNum())
				return Integer.compare(b.getNum(), a.getNum());
			else if(a.getWord().length() != b.getWord().length())
				return Integer.compare(b.getWord().length(), a.getWord().length());
			else
				return a.getWord().compareTo(b.getWord());
		});
		
		for(int i = 0; i < words.length; i++) {
			bw.append(words[i].getWord() + "\n");
		}
		bw.flush();
		bw.close();
	}
}

class Word {
	private String word;
	private int num;
	
	public Word(String word, int num) {
		this.word = word;
		this.num = num;
	}
	
	public String getWord() {
		return word;
	}
	
	public int getNum() {
		return num;
	}
}

