package do_it_lecture;

import java.util.Arrays;
import java.util.Scanner;

public class P1920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 데이터 개수
		int[] data = new int[n];
		for(int i = 0; i < n; i++) { // 데이터 입력
			data[i] = sc.nextInt();
		}
		Arrays.sort(data); // 데이터 정렬
		
		int m = sc.nextInt(); // 찾아야 할 숫자 개수
		int[] find_data = new int[m];
		for(int i = 0; i < m; i++) { // 찾아야 할 데이터 입력
			find_data[i] = sc.nextInt();
		}
		
		for(int i = 0; i < m; i++) {
			int start_idx = 0;
			int end_idx = n - 1;
			int mid_idx = (start_idx + end_idx) / 2;
			int mid_val = data[mid_idx];
			boolean is_find = false;
			
			while(start_idx <= end_idx) {
				if(find_data[i] > mid_val) {
					start_idx = mid_idx + 1;
					mid_idx = (start_idx + end_idx) / 2;
					mid_val = data[mid_idx];
				} else if(find_data[i] < mid_val) {
					end_idx = mid_idx - 1;
					mid_idx = (start_idx + end_idx) / 2;
					mid_val = data[mid_idx];
				} else {
					if(find_data[i] == mid_val) {
						is_find = true;
					} else {
						is_find = false;
					}
					break;
				}
			}
			if(is_find) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
		
	}

}
