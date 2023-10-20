package do_it_lecture;

import java.util.Scanner;

public class P11659 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 데이터의 개수, 질의 개수
		int[] num = new int[2];
		for(int i = 0; i < 2; i++) {
			num[i] = sc.nextInt();
		}
		
		// 구간 합을 구할 대상 배열과 합
		int[] arr = new int[num[0] + 1];
		int[] sumArr = new int[num[0] + 1];
		int sum = 0;
		
		for(int i = 1; i <= num[0]; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			sumArr[i] = sum;
		}
		
		// 합을 구해야하는 구간
		int[] section = new int[2];
		for(int i = 0; i < num[1]; i++) {
			for(int j = 0; j < 2; j++) {
				section[j] = sc.nextInt();
			}
			System.out.println(sumArr[section[1]] - sumArr[section[0] - 1]);
		}
	}
}
