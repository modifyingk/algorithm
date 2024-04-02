package baekjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2750_quick {
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
	
	public static void quickSort(int[] a, int left, int right) {
		if(left >= right)
			return;
		int pivot = left;
		int pl = left + 1; int pr = right;
		
		while(pl <= pr) {
			while(pl <= pr && a[pl] <= a[pivot])
				pl++;
			while(pl <= pr && a[pivot] <= a[pr])
				pr--;
			if(pl > pr) {
				swap(a, pivot, pr);
			} else {
				swap(a, pl, pr);
			}
		}
		quickSort(a, left, pl - 1);
		quickSort(a, pr + 1, right);
	}

	public static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
