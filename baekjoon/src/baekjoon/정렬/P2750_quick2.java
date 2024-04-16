package baekjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2750_quick2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		// input
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		// quick sort
		quickSort(arr, 0, n-1);
		
		// output
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
	
	// quick sort
	public static void quickSort(int[] a, int left, int right) {
		if(left >= right)
			return;
		
		int pl = left;
		int pr = right;
		int pivot = a[(left + right) / 2];
		
		while(pl <= pr) {
			while(a[pl] < pivot)
				pl++;
			while(pivot < a[pr])
				pr--;
			if(pl <= pr)
				swap(a, pl++, pr--);
		}
		quickSort(a, left, pr);
		quickSort(a, pl, right);
	}

	public static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
