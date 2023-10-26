package do_it_lecture;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class P11286 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] input = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		int min = 0;
		int min_idx = 0;
		
		List<Integer> list = new LinkedList<>();
		for(int i = 0; i < input.length; i++) {
			if(input[i] != 0) { // 0이 아닌 숫자가 입력되면 배열에 추가
				list.add(input[i]);
			} else { // 0이 입력되면
				if(list.size() < 1) { // 배열이 빈 경우 0 출력
					System.out.println(0);
				} else {
					// 리스트에서 절대값 비교
					min = list.get(0);
					min_idx = 0;
					for(int j = 0; j < list.size(); j++) {
						if(Math.abs(list.get(j)) < Math.abs(min)) {
							min = list.get(j);
							min_idx = j;
						} else if(Math.abs(list.get(j)) == Math.abs(min)) {
							if(list.get(j) < min) {
								min = list.get(j);
								min_idx = j;
							}
						}
					}
					// 작은 숫자 출력
					System.out.println(min);
					list.remove(min_idx);
				}
			}
		}
	}

}
