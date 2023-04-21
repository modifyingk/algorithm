package training;

public class n번째원소까지 {
	
	public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for(int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] num1 = {2, 1, 6};
		int[] num2 = {5, 2, 1, 7, 5};
		
		int[] test1 = solution(num1, 1);
		int[] test2 = solution(num2, 3);
		
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
