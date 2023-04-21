package training;

public class 문자열앞의n글자 {
	
	public static String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(0, n);
        return answer;
    }
	
	public static void main(String[] args) {
		String test1 = solution("ProgrammerS123", 11);
		String test2 = solution("He110W0r1d", 5);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
