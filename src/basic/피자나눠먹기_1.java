package basic;

public class 피자나눠먹기_1 {

	public static int solution(int n, int k) {
        int answer = 0;
        int total = 0;
        total = 12000 * n + 2000 * k;
        if(n >= 10) {
            if(k > 0) {
                answer = total - (2000 * (n / 10));   
            } else {
                answer = total;
            }
        } else {
            answer = total;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(10, 3);
		int test2 = solution(64, 6);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
