package basic;

public class 제곱수판별하기 {

	public static int solution(int n) {
        int answer = 0;
        if(n % Math.sqrt(n) == 0) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(144);
		int test2 = solution(976);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
