package training;

public class 길이에따른연산 {
	
	public static int solution(int[] num_list) {
        int answer = 0;
        if(num_list.length >= 11) {
            for(int i = 0; i < num_list.length; i++) {
                answer += num_list[i];
            }
        } else {
            answer = 1;
            for(int i = 0; i < num_list.length; i++) {
                answer *= num_list[i];
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] num1 = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
		int[] num2 = {2, 3, 4, 5};
		
		int test1 = solution(num1);
		int test2 = solution(num2);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
