package basic;

public class 피자나눠먹기_3 {

	public static int solution(int slice, int n) {
        int answer = 0;
        if(n % slice != 0) {
        	answer = n / slice + 1;
        } else {
            answer = n / slice;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(7, 10);
		int test2 = solution(4, 12);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
