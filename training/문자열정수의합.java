package training;

public class 문자열정수의합 {
	
	public static int solution(String num_str) {
        int answer = 0;
        char[] ch = new char[num_str.length()];
        for(int i = 0; i < num_str.length(); i++) {
            ch[i] = num_str.charAt(i);
            answer += Character.getNumericValue(ch[i]);
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution("123456789");
		int test2 = solution("1000000");
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
