package training;

public class 두수의연산값비교하기 {
	
	public static int solution(int a, int b) {
        int answer = 0;
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        int num = Integer.parseInt(strA + strB);
        int num2 = 2 * a * b;
        if(num >= num2) answer = num;
        else answer = num2;
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(2, 91);
		int test2 = solution(91, 2);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
