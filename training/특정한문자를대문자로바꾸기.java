package training;

public class 특정한문자를대문자로바꾸기 {
	
	public static String solution(String my_string, String alp) {
        String answer = "";
        answer = my_string.replace(alp, alp.toUpperCase());
        return answer;
    }
	
	public static void main(String[] args) {
		String test1 = solution("programmers", "p");
		String test2 = solution("lowercase", "x");
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
