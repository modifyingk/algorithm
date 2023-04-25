package training;

public class 원하는문자열찾기 {
	
	public static int solution(String myString, String pat) {
        int answer = 0;
        if(myString.toLowerCase().contains(pat.toLowerCase())) {
            answer = 1;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution("AbCdEfG", "aBc");
		int test2 = solution("aaAA", "aaaaa");
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
