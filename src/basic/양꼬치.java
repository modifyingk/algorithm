package basic;

public class 양꼬치 {

	public static int solution(int n) {
        int answer = 0;
        if(n % 7 != 0) {
            answer = n / 7 + 1;
        } else {
            answer = n / 7;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(7);
		int test2 = solution(1);
		int test3 = solution(15);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);

		System.out.print("test3 : ");
		System.out.println(test3);
	}

}
