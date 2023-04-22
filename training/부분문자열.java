package training;

public class 부분문자열 {
	
	public static int solution(String str1, String str2) {
        int answer = 0;
        if(str2.contains(str1)) {
            answer = 1;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution("abc", "aabcc");
		int test2 = solution("tbt", "tbbttb");
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
