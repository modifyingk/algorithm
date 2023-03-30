package basic;

/* 정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 0 ≤ num1 ≤ 10,000
 * 0 ≤ num2 ≤ 10,000
 */

public class 숫자비교하기 {

	public static int solution(int num1, int num2) {
		int answer = 0;
        if(num1 >= 0 && num1 <= 10000 && num2 >= 0 && num2 <= 10000) {
            if(num1 == num2) {
                answer = 1;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(2, 3);
		int test2 = solution(11, 11);
		int test3 = solution(7, 99);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);

		System.out.print("test3 : ");
		System.out.println(test3);
	}

}
