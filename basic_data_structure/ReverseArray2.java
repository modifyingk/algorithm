package basic_data_structure;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray2 {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for(int i = 0; i < a.length / 2; i++) {
			System.out.println("a[" + i + "]과" + "a[" + (a.length - i - 1) + "]을 교환합니다.");
			swap(a, i, a.length - i - 1);
			System.out.println(Arrays.toString(a));
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(x));
		reverse(x);
		
		System.out.println("역순 정렬을 마쳤습니다.");
	}

}
