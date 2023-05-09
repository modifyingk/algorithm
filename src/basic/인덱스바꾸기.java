package basic;

public class 인덱스바꾸기 {

	public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] str = my_string.split("");
        
        String temp = str[num1];
        str[num1] = str[num2];
        str[num2] = temp;
        
        for(int i = 0; i < str.length; i++) {
            answer += str[i];   
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String test1 = solution("hello", 1, 2);
		String test2 = solution("I love you", 3, 6);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
