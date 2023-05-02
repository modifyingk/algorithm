package basic;

public class 세균증식 {

	public static int solution(int n, int t) {
        int answer = 0;
        for(int i = 1; i <= t; i++) {
            n = n * 2;
        }
        answer = n;
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(2, 10);
		int test2 = solution(7, 15);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
