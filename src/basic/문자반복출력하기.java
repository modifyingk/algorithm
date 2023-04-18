package basic;

public class 문자반복출력하기 {

	public static String solution(String my_string, int n) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
            for(int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String test1 = solution("hello", 3);
		
		System.out.print("test1 : ");
		System.out.println(test1);
	}

}
