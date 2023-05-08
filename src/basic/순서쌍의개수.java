package basic;

public class 순서쌍의개수 {

	public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                answer++;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(20);
		int test2 = solution(100);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
