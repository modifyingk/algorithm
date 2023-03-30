package basic;

public class 두수의나눗셈 {

	public static int solution(int num1, int num2) {
		int answer = 0;
        if(num1 > 0 && num1 <= 100 && num2 > 0 && num2<= 100) {
            answer = (int)(((double)num1) / num2 * 1000);
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(3, 2);
		int test2 = solution(7, 3);
		int test3 = solution(1, 16);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);

		System.out.print("test3 : ");
		System.out.println(test3);
	}

}
