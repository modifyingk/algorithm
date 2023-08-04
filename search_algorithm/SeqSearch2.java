package search_algorithm;

import java.util.Scanner;

public class SeqSearch2 {

	static int seqSearch(int[] a, int n, int key) {
		System.out.print("   |");
		for(int i = 0; i < n; i++) {
			System.out.printf("%5d", i);
		}
		System.out.println();
		
		System.out.print("----");
		for(int i = 0; i < n; i++) {
			System.out.print("-----");
		}
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			System.out.print("   |");
			for(int j = 0; j < i; j++) {
				System.out.print("     ");
			}
			System.out.printf("%5s\n", "*");
			System.out.printf("%3d|", i);
			for(int k = 0; k < n; k++) {
				System.out.printf("%5d", a[k]);
			}
			System.out.println();
			System.out.println("   |");
			if(a[i] == key)
				return i;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int ky = sc.nextInt();
		
		int idx = seqSearch(x, num, ky);
		
		System.out.println();
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
		}
	}

}
