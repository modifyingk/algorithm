package basic;

public class 문자열뒤집기 {

	public static String solution(String my_string) {
        String answer = "";
        for(int i = my_string.length() - 1; i >= 0; i--) {
            answer += String.valueOf(my_string.charAt(i));
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String test1 = solution("jaron");
		String test2 = solution("bread");
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
