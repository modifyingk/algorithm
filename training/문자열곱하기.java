package training;

public class 문자열곱하기 {
	
	public static String solution(String my_string, int k) {
        String answer = "";
        for(int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String test1 = solution("string", 3);
		String test2 = solution("love", 10);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
