package basic;

public class 점의위치구하기 {

	public static int solution(int[] dot) {
        int answer = 0;
        if(dot[0] > 0) {
            if(dot[1] > 0) {
                answer = 1;
            } else {
                answer = 4;
            }
        } else {
            if(dot[1] > 0) {
                answer = 2;
            } else {
                answer = 3;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] num1 = {2, 4};
		int[] num2 = {-7, 9};
		
		int test1 = solution(num1);
		int test2 = solution(num2);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
