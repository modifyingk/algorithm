package basic;

public class 외계행성의나이 {

	public static String solution(int age) {
        String answer = "";
        char[] ch = (String.valueOf(age)).toCharArray();
        for(int i = 0; i < ch.length; i++) {
            ch[i] = (char)((int)ch[i] + 49);
        }
        answer = String.valueOf(ch);
        return answer;
    }
	
	public static void main(String[] args) {
		String test1 = solution(23);
		String test2 = solution(51);
		String test3 = solution(100);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
		
		System.out.print("test3 : ");
		System.out.println(test3);
	}

}
