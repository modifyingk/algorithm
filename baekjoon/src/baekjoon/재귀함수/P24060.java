package baekjoon.재귀함수;

import java.io.*;
import java.util.*;

public class P24060 {
	
	static int[] tmp;
	static ArrayList<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] a = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		tmp = new int[n];
		merge_sort(a, 0, n-1);
		
		if(list.size() < k)
			System.out.println(-1);
		else
			System.out.println(list.get(k - 1));
		
	}
	
	private static void merge_sort(int[] a, int p, int r) {
		if(p < r) {
			int q = (p + r) / 2;
			merge_sort(a, p, q);
			merge_sort(a, q + 1, r);
			merge(a, p, q, r);
		}
	}

	private static void merge(int[] a, int p, int q, int r) {
		int i = p;
		int j = q + 1;
		int t = 0;
		
		while(i <= q && j <= r) {
			if(a[i] <= a[j])
				tmp[t++] = a[i++];
			else
				tmp[t++] = a[j++];
		}
		
		while(i <= q)
			tmp[t++] = a[i++];
		
		while(j <= r)
			tmp[t++] = a[j++];
		
		i = p;
		t = 0;
		
		while(i <= r) {
			list.add(tmp[t]);
			a[i++] = tmp[t++];
		}
		
	}
}
