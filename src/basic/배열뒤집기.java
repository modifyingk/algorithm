package basic;

public class 배열뒤집기 {

	public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int j = num_list.length - 1;
        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[j];
            j--;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] num1 = {1, 2, 3, 4, 5};
		int[] num2 = {1, 1, 1, 1, 1, 2};
		int[] num3 = {1, 0, 1, 1, 1, 3, 5};
		
		int[] test1 = solution(num1);
		int[] test2 = solution(num2);
		int[] test3 = solution(num3);
		
		System.out.print("test1 : [ ");
		for(int i = 0; i < num1.length; i++) {
			System.out.print(test1[i] + " ");
		}
		System.out.println("]");
		
		System.out.print("test2 : [ ");
		for(int i = 0; i < num2.length; i++) {
			System.out.print(test2[i] + " ");
		}
		System.out.println("]");
		
		System.out.print("test3 : [ ");
		for(int i = 0; i < num3.length; i++) {
			System.out.print(test3[i] + " ");
		}
		System.out.println("]");
	}

}
