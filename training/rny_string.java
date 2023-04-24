package training;

public class rny_string {
	
	public static String solution(String rny_string) {
        String answer = "";
        answer = rny_string.replace("m", "rn");
        return answer;
    }
	
	public static void main(String[] args) {
		String test1 = solution("masterpiece");
		String test2 = solution("programmers");
		String test3 = solution("jerry");
		String test4 = solution("burn");
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
		
		System.out.print("test3 : ");
		System.out.println(test3);
		
		System.out.print("test3 : ");
		System.out.println(test3);
	}
}
