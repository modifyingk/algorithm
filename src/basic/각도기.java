package basic;

public class 각도기 {

	public static int solution(int angle) {
		int answer = 0;
        if(angle > 0 && angle < 90) {
            answer = 1;
        } else if(angle == 90) {
            answer = 2;
        } else if(angle > 90 && angle < 180) {
            answer = 3;
        } else {
            answer = 4;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(70);
		int test2 = solution(91);
		int test3 = solution(180);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
		
		System.out.print("test3 : ");
		System.out.println(test3);
	}

}
