package basic;

public class 자릿수더하기 {

	public static int solution(int n) {
        int answer = 0;
        String strN = String.valueOf(n);
        for(int i = 0; i < strN.length(); i++) {
        	answer += Character.getNumericValue(strN.charAt(i));
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(1234);
		int test2 = solution(930211);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
