package baekjoon.이차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class P10798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<char[]> arr = new ArrayList<>();
		int[] len = new int[5];
		for(int i = 0; i < 5; i++) {
			arr.add(br.readLine().toCharArray());
			len[i] = arr.get(i).length;
		}
		int max = len[0];
		for(int i = 1; i < 5; i++) {
			if(max < len[i])
				max = len[i];
		}
		int i = 0; // 열
		while(i < max) {
			for(int j = 0; j < 5; j++) { // 행
				if(i < arr.get(j).length) {
					bw.append(arr.get(j)[i]);
				}
			}
			i++;
		}
		bw.flush();
		bw.close();
	}

}
