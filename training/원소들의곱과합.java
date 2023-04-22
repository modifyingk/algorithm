package training;

public class 원소들의곱과합 {
	
	public static int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int sum = 0;
        for(int i = 0; i < num_list.length; i++) {
            mul *= num_list[i];
            sum += num_list[i];
        }
        if(mul < (sum * sum)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] num1 = {3, 4, 5, 2, 1};
		int[] num2 = {5, 7, 8, 3};
		
		int test1 = solution(num1);
		int test2 = solution(num2);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
