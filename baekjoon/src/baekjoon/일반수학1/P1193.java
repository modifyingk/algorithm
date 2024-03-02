package baekjoon.일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1193 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int row = 1; int col = 1;
		int sum = row + col;
		for(int i = 1; i < n; i++) {
			if(sum == 2) {
				col++;
			} else if(sum % 2 == 0) {
				if(row == 1) {
					col++;
				} else {
					row--; col++;
				}
			} else {
				if(col == 1) {
					row++;
				} else {
					row++; col--;
				}
			}
			sum = row + col;
		}
		System.out.println(row + "/" + col);
	}

}

