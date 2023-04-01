package basic;

public class 나이출력 {

	public static int solution(int age) {
        int answer = 0;
        answer = 2022 - age + 1;
        return answer;
    }
	
	public static void main(String[] args) {
		int test1 = solution(40);
		int test2 = solution(23);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
