package training;

public class 문자열을정수로변환하기 {
	
	public static int solution(String n_str) {
        int answer = 0;
        answer = Integer.parseInt(n_str);
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution("10");
		int test2 = solution("8542");
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
