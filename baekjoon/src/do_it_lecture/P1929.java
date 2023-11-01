package do_it_lecture;

import java.util.Scanner;

public class P1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				arr[i] = 0;
			}
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] != 0 && arr[i] != 0) {
					if(arr[j] % arr[i] == 0) {
						arr[j] = 0;
					}
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= m) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
