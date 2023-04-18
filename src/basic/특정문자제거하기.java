package basic;

public class 특정문자제거하기 {

	public static String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replace(letter, "");
        return answer;
    }
	
	public static void main(String[] args) {
		String test1 = solution("abcdef", "f");
		String test2 = solution("BCBdbe", "B");
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
