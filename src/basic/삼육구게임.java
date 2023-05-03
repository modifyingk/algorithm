package basic;

public class 삼육구게임 {

	public static int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);
        for(int i = 0; i < str.length(); i++) {
        	if(str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) == '9') {
        		answer += 1;
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(3);
		int test2 = solution(29423);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
