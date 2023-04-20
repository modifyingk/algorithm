package training;

public class 조건문자열 {
	
	public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(eq.equals("=")) {
            if(ineq.equals(">")) {
                answer = (n >= m ? 1 : 0);
            } else {
                answer = (n <= m ? 1 : 0);
            }
        } else {
            if(ineq.equals(">")) {
                answer = (n > m ? 1 : 0);
            } else {
                answer = (n < m ? 1 : 0);
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution("<", "=", 20, 50);
		int test2 = solution(">", "!", 41, 78);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
