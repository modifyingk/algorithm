package basic;

/* 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
 * 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

 * 제한사항
 * 0 <numer1, denom1, numer2, denom2 < 1,000
 */

public class 분수의덧셈 {
	
	public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];
		int numer = 0;
		int denom = 0;
		int eq = 1;

		boolean term1 = numer1 > 0 && numer1 < 1000 && denom1 > 0 && denom1 < 1000;
		boolean term2 = numer2 > 0 && numer2 < 1000 && denom2 > 0 && denom2 < 1000;

		if (term1 && term2) {
			if (denom1 == denom2) {
				numer = numer1 + numer2; // 분자
				denom = denom1; // 분모
			} else {
				numer = numer1 * denom2 + numer2 * denom1; // 분자
				denom = denom1 * denom2; // 분모
			}
			// 기약분수
			if (numer > denom) {
				for (int i = 1; i <= numer; i++) {
					if (numer % i == 0 && denom % i == 0) {
						eq = i;
					}
				}
			} else {
				for (int i = 1; i <= denom; i++) {
					if (numer % i == 0 && denom % i == 0) {
						eq = i;
					}
				}
			}
			answer[0] = numer / eq;
			answer[1] = denom / eq;
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] test1 = solution(1, 2, 3, 4);
		int[] test2 = solution(9, 2, 1, 3);
		
		System.out.print("test1 : ");
		for(int i = 0; i < 2; i++) {
			System.out.print(test1[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("test2 : ");
		for(int i = 0; i < 2; i++) {
			System.out.print(test2[i] + " ");
		}
	}

}
