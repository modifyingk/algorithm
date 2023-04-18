package basic;

public class 편지 {

	public static int solution(String message) {
        int answer = 0;
        answer = message.length() * 2;
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution("happy birthday!");
		int test2 = solution("I love you~");
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
