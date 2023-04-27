package training;

public class 문자열섞기 {
	
	public static String solution(String str1, String str2) {
        String answer = "";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        for(int i = 0; i < str1.length(); i++) {
            answer = answer + ch1[i] + ch2[i];
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String test1 = solution("aaaaa", "bbbbb");
		
		System.out.print("test1 : ");
		System.out.println(test1);
	}
}
