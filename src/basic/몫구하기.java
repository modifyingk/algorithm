package basic;

public class 몫구하기 {

	public static int solution(int num1, int num2) {
		int answer = 0;
        if(num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100){
            answer = num1 / num2;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(10, 5);
		int test2 = solution(7, 2);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
