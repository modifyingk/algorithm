package training;

public class n의배수 {
	
	public static int solution(int num, int n) {
        int answer = 0;
        if(num % n == 0) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(98, 2);
		int test2 = solution(34, 3);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
