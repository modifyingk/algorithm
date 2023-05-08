package basic;

public class 숨어있는숫자의덧셈1 {

	public static int solution(String my_string) {
        int answer = 0;
        char[] ch = my_string.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if((int)ch[i] >= 48 && (int)ch[i] <= 57) {
                answer += (int)ch[i] - 48;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution("aAb1B2cC34oOp");
		int test2 = solution("1a2b3c4d123");
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
