package training;

public class 대문자로바꾸기 {
	
	public static String solution(String myString) {
        String answer = "";
        answer = myString.toUpperCase();
        return answer;
    }
	
	public static void main(String[] args) {
		String test1 = solution("aBcDeFg");
		String test2 = solution("AAA");
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
