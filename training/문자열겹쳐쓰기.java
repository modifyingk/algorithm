package training;

public class 문자열겹쳐쓰기 {
	
	public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int idx = s + overwrite_string.length();
        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(idx);
        return answer;
    }
	
	public static void main(String[] args) {
		String test1 = solution("He11oWor1d", "lloWorl", 2);
		String test2 = solution("Program29b8UYP", "merS123", 7);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
