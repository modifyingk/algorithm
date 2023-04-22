package training;

public class 주사위게임1 {
	
	public static int solution(int a, int b) {
        int answer = 0;
        if(a % 2 != 0 && b % 2 != 0) {
            answer = a * a + b * b;
        } else if(a % 2 == 0 && b % 2 == 0) {
            answer = Math.abs(a - b);
        } else {
            answer = 2 * (a + b);
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(3, 5);
		int test2 = solution(6, 1);
		int test3 = solution(2,4);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);

		System.out.print("test3 : ");
		System.out.println(test3);
	}
}
