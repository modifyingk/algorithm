package training;

public class flag에따라다른값반환하기 {
	
	public static int solution(int a, int b, boolean flag) {
        int answer = 0;
        answer = flag ? a + b : a - b;
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(-4, 7, true);
		int test2 = solution(-4, 7, false);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
