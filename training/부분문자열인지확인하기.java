package training;

public class 부분문자열인지확인하기 {
	
	public static int solution(String my_string, String target) {
        int answer = 0;
        if(my_string.contains(target)) {
            answer = 1;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution("banana", "ana");
		int test2 = solution("banana", "wxyz");
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
