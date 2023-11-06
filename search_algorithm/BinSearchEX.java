package search_algorithm;

import java.util.Scanner;

public class BinSearchEX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 요솟수
		int[] x = new int[n]; // 요소
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		int key = sc.nextInt(); // 찾는 값
		System.out.printf("%3s|", "");
		for(int i = 0; i < n; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		System.out.print("---+");
		for(int i = 0; i < n; i++) {
			System.out.printf("%3s", "---");
		}
		
		int pl = 0;
		int pr = n - 1;
		int pc = 0;
		
		do {
			pc = (pl + pr) / 2;
			System.out.println();
			System.out.print("   |");
			for(int i = pl; i <= pr; i++) {
				if(i == pl) {
					System.out.printf("%3s", "<-");
				} else if(i == pr) {
					System.out.printf("%3s", "->");
				} else if(i == pc) {
					System.out.printf("%3s", "+");
				} else {
					System.out.printf("%3s", "");
				}
			}
			
			System.out.println();
			System.out.printf("%3d|", pc);
			for(int i = 0; i < n; i++) {
				System.out.printf("%3d", x[i]);
			}
			System.out.print("\n   |");
			if(x[pc] < key) {
				pl = pc + 1;
			} else if(x[pc] > key) {
				pr = pc - 1;
			} else {
				System.out.println("\n\n" + key + "는 x[" + pc + "]에 있습니다.");
				break;
			}
		} while(pl <= pr);
		
	}

}
