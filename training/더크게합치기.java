package training;

public class 더크게합치기 {
	
	public static int solution(int a, int b) {
        int answer = 0;
        int num1 = Integer.parseInt(a + "" + b);
        int num2 = Integer.parseInt(b + "" + a);
        if(num1 >= num2) answer = num1;
        else answer = num2;
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(9, 91);
		int test2 = solution(89, 8);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
