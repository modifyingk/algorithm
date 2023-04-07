package basic;

public class 중복된숫자개수 {

	public static int solution(int[] array, int n) {
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == n) {
                answer += 1;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] num1 = {1, 1, 2, 3, 4, 5};
		int[] num2 = {0, 2, 3, 4};

		int test1 = solution(num1, 1);
		int test2 = solution(num2, 1);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
