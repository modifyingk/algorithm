package training;

public class 마지막두원소 {
	
	public static int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len + 1];

        for(int i = 0; i < len; i++) {
            answer[i] = num_list[i];
        }
        
        if(num_list[len - 1] > num_list[len - 2]) {
            answer[len] = num_list[len - 1] - num_list[len - 2];
        } else {
            answer[len] = num_list[len - 1] * 2;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] num1 = {2, 1, 6};
		int[] num2 = {5, 2, 1, 7, 5};

		int[] test1 = solution(num1);
		int[] test2 = solution(num2);
		
		System.out.print("test1 : [ ");
		for(int i = 0; i < test1.length; i++) {
			System.out.print(test1[i] + " ");
		}
		System.out.println("]");
		
		System.out.print("test2 : [ ");
		for(int i = 0; i < test2.length; i++) {
			System.out.print(test2[i] + " ");
		}
		System.out.println("]");
	}
}
