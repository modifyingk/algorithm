package training;

public class 간단한식계산하기 {
	
	public static int solution(String binomial) {
        int answer = 0;
        String[] str = binomial.split(" ");
        if(str[1].equals("+")) {
            answer = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
        } else if(str[1].equals("-")) {
            answer = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
        } else {
            answer = Integer.parseInt(str[0]) * Integer.parseInt(str[2]);
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution("43 + 12");
		int test2 = solution("0 - 7777");
		int test3 = solution("40000 * 40000");
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
		
		System.out.print("test3 : ");
		System.out.println(test3);
	}
}
