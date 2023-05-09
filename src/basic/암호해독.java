package basic;

public class 암호해독 {

	public static String solution(String cipher, int code) {
        String answer = "";
        String[] str = cipher.split("");
        for(int i = 1; i <= str.length; i++) {
            if(i % code == 0) {
                 answer += str[i - 1];
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String test1 = solution("dfjardstddetckdaccccdegk", 4);
		String test2 = solution("pfqallllabwaoclk", 2);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
