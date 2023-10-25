package do_it_lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int dna_len = Integer.parseInt(st.nextToken()); // dna 길이
		int str_len = Integer.parseInt(st.nextToken()); // 부분 문자열 길이
		int count = 0; // 비밀번호 개수 (결과)
		int[] str_acgt = new int[4]; // dna 비번 확인
		char[] dna = new char[dna_len]; // dna 문자열
		dna = bf.readLine().toCharArray();
		
		StringTokenizer st2 = new StringTokenizer(bf.readLine());
		int[] min_acgt = new int[4]; // ACGT 최소 개수
		for(int i = 0; i < 4; i++) {
			min_acgt[i] = Integer.parseInt(st2.nextToken());
		}
		
		int start = 0;
		int end = start + str_len - 1;
		
		for(int i = 0; i < str_len; i++) {
			if(dna[i] == 'A') {
				str_acgt[0]++;
			} else if(dna[i] == 'C') {
				str_acgt[1]++;
			} else if(dna[i] == 'G') {
				str_acgt[2]++;
			} else {
				str_acgt[3]++;
			}
		}
		if(str_acgt[0] >= min_acgt[0] && str_acgt[1] >= min_acgt[1] && str_acgt[2] >= min_acgt[2] && str_acgt[3] >= min_acgt[3]) {
			count++;
		}
		
		while(end < dna_len - 1) {
			start++; end++;
			if(dna[start - 1] == 'A') {
				str_acgt[0]--;
			} else if(dna[start - 1] == 'C') {
				str_acgt[1]--;
			} else if(dna[start - 1] == 'G') {
				str_acgt[2]--;
			} else {
				str_acgt[3]--;
			}
			
			if(dna[end] == 'A') {
				str_acgt[0]++;
			} else if(dna[end] == 'C') {
				str_acgt[1]++;
			} else if(dna[end] == 'G') {
				str_acgt[2]++;
			} else {
				str_acgt[3]++;
			}
			
			if(str_acgt[0] >= min_acgt[0] && str_acgt[1] >= min_acgt[1] && str_acgt[2] >= min_acgt[2] && str_acgt[3] >= min_acgt[3]) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
