package basic;

public class 문자열안에문자열 {

	public static int solution(String str1, String str2) {
        int answer = 0;
        if(str1.contains(str2)){
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution("ab6CDE443fgh22iJKlmn1o", "6CD");
		int test2 = solution("ppprrrogrammers", "pppp");
		int test3 = solution("AbcAbcA", "AAA");
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	
		System.out.print("test3 : ");
		System.out.println(test3);
	}

}
