package training;

public class 첫번째로나오는음수 {
	
	public static int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] < 0) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] num1 = {12, 4, 15, 46, 38, -2, 15};
		int[] num2 = {13, 22, 53, 24, 15, 6};
		
		int test1 = solution(num1);
		int test2 = solution(num2);
		
		System.out.print("test1 : ");
		System.out.println(test1);

		System.out.print("test2 : ");
		System.out.println(test2);
	}
}
