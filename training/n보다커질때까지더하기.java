package training;

public class n보다커질때까지더하기 {
	
	public static int solution(int[] numbers, int n) {
        int answer = 0;
        for(int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
            if(answer > n) break;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] num1 = {34, 5, 71, 29, 100, 34};
		int[] num2 = {58, 44, 27, 10, 100};
		
		int test1 = solution(num1, 123);
		int test2 = solution(num2, 139);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
