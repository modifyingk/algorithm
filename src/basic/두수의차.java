package basic;

public class 두수의차 {

	public static int solution(int num1, int num2) {
		int answer = 0;
        if(num1 >= -50000 && num1 <= 50000 && num2 >= -50000 && num2 <= 50000){
            answer = num1 - num2;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(2, 3);
		int test2 = solution(100, 2);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
