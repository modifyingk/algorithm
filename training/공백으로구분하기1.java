package training;

public class 공백으로구분하기1 {
	
	public static String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
    }
	
	public static void main(String[] args) {
		String[] test1 = solution("i love you");
		String[] test2 = solution("programmers");
		
		System.out.print("test1 : [ ");
		for(int i = 0; i < test1.length; i++) {
			System.out.print(test1[i] + " ");
		}
		System.out.println("]");

		System.out.print("test2 : [ ");
		for(int i = 0; i < test2.length; i++) {
			System.out.print(test2[i] + " ");
		}
		System.out.println("]");
	}
}
