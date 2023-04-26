package training;

public class 홀수vs짝수 {
	
	public static int solution(int[] num_list) {
        int answer = 0;
        int even = 0;
        int odd = 0;
        for(int i = 0; i < num_list.length; i++) {
            if(i % 2 == 0) {
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }
        if(even >= odd) answer = even;
        else answer = odd;
        return answer;
    }
	
	public static void main(String[] args) {
		int[] num1 = {4, 2, 6, 1, 7, 6};
		int[] num2 = {-1, 2, 5, 6, 3};
		
		int test1 = solution(num1);
		int test2 = solution(num2);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
