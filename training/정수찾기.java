package training;

public class 정수찾기 {
	
	public static int solution(int[] num_list, int n) {
        int answer = 0;
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] == n) {
                answer = 1;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] num1 = {1, 2, 3, 4, 5};
		int[] num2 = {15, 98, 23, 2, 15};
		
		int test1 = solution(num1, 3);
		int test2 = solution(num2, 20);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
