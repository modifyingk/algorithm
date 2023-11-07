package search_algorithm;

import java.util.Scanner;

public class BinSearchX {
	
	static int binSearchEx(int[] x, int n, int key) {
		int pl = 0;
		int pr = n - 1;

		do {
			int pc = (pl + pr) / 2;
			if(x[pc] < key) {
				pl = pc + 1;
			} else if(x[pc] > key) {
				pr = pc - 1;
			} else {
				return pc;
			}
		} while(pl <= pr);
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 요솟수
		int[] x = new int[n]; // 요소
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		int key = sc.nextInt(); // 찾는 값
		int result = binSearchEx(x, n, key);
		System.out.println();

		if(result >= 0) {
			for(int i = result; i >= 0; i--) {
				if(x[i] == key) {
					result = i;
				}
			}
			System.out.println(key + "는 x[" + result + "]에 있습니다.");
		} else {
			System.out.println("그 값의 요소는 존재하지 않습니다.");
		}
		
	}

}
