package search_algorithm;

import java.util.Scanner;

public class SearchIndex {

	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int j = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				idx[j] = i;
				j++;
			}
		}
		return j;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] idx = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		int result = searchIdx(a, n, key, idx);
		System.out.println(result);
	}

}
