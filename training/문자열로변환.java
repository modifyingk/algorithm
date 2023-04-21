package training;

public class 문자열로변환 {
	
	public static String solution(int n) {
        String answer = "";
        answer = String.valueOf(n);
        return answer;
    }
	
	public static void main(String[] args) {
		String test1 = solution(123);
		String test2 = solution(2573);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
