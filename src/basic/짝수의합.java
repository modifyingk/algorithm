package basic;

public class 짝수의합 {

	public static int solution(int n) {
        int answer = 0;
        for(int i = 0; i <= n; i++) {
            if(i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(10);
		int test2 = solution(4);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
