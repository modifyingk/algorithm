package training;

public class 홀짝에따라다른값반환하기 {
	
	public static int solution(int n) {
        int answer = 0;
        if(n % 2 != 0) {
            for(int i = 1; i <= n; i++) {
                if(i % 2 != 0) answer += i;
            }
        } else {
            for(int i = 1; i <= n; i++) {
                if(i % 2 == 0) answer += i * i;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(7);
		int test2 = solution(10);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
