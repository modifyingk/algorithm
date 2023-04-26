package training;

public class 이어붙인수 {
	
	public static int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                even += String.valueOf(num_list[i]);
            } else {
                odd += String.valueOf(num_list[i]);
            }
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
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
