package basic;

public class 배열자르기 {

	public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int j = 0;
        for(int i = num1; i <= num2; i++) {
            answer[j] = numbers[i];
            j++;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] num1 = {1, 2, 3, 4, 5};
		int[] num2 = {1, 3, 5};
		
		int[] test1 = solution(num1, 1, 3);
		int[] test2 = solution(num2, 1, 2);
		
		System.out.print("test1 : ");
		for(int i = 0; i < test1.length; i++) {
			System.out.print(test1[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("test2 : ");
		for(int i = 0; i < test2.length; i++) {
			System.out.print(test2[i] + " ");
		}
	}

}
