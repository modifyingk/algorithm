package basic;

public class 짝수홀수개수 {

	public static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even = 0;
        int odd = 0;
        for(int i = 0 ; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        answer[0] = even;
        answer[1] = odd;
        return answer;
    }
	
	public static void main(String[] args) {
		int[] num1 = {1, 2, 3, 4, 5};
		int[] num2 = {1, 3, 5, 7};

		int[] test1 = solution(num1);
		int[] test2 = solution(num2);
		
		System.out.print("test1 : ");
		for(int i = 0; i < 2; i++) {
			System.out.print(test1[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("test2 : ");
		for(int i = 0; i < 2; i++) {
			System.out.print(test2[i] + " ");
		}
	}

}
