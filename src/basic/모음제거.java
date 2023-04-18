package basic;

public class 모음제거 {

	public static String solution(String my_string) {
        String answer = my_string;
        answer = answer.replaceAll("a", "");
        answer = answer.replaceAll("e", "");
        answer = answer.replaceAll("i", "");
        answer = answer.replaceAll("o", "");
        answer = answer.replaceAll("u", "");
        return answer;
    }
	
	public static void main(String[] args) {
		String test1 = solution("bus");
		String test2 = solution("nice to meet you");
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
