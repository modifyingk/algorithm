package training;

public class 공배수 {
	
	public static int solution(int number, int n, int m) {
        int answer = 0;
        if(number % n == 0 && number % m == 0) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(60, 2, 3);
		int test2 = solution(55, 10, 5);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
