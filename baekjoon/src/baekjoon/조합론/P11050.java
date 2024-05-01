package baekjoon.조합론;

import java.util.Scanner;

public class P11050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int nFact = 1;
		int kFact = 1;

		for(int i = 0; i < k; i++) {
			nFact *= n;
			n--;
		}
		for(int i = k; i > 0; i--) {
			kFact *= i;
		}
		System.out.println(nFact / kFact);
		sc.close();
	}
}
