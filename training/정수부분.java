package training;

public class 정수부분 {
	
	public static int solution(double flo) {
        int answer = 0;
        answer = (int)flo;
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(1.42);
		int test2 = solution(69.32);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
