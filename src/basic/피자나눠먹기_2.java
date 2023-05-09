package basic;

public class 피자나눠먹기_2 {

	public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if((6 * i) % n == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(6);
		int test2 = solution(10);
		int test3 = solution(4);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);

		System.out.print("test3 : ");
		System.out.println(test3);
	}

}
