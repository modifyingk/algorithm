package basic;

public class 배열두배만들기 {

	public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        if(numbers.length <= 1000) {
            for(int i = 0; i < numbers.length; i++) {
                if(numbers[i] >= -10000 && numbers[i] <= 10000) {
                    answer[i] = numbers[i] * 2;
                }
            }  
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] num1 = {1, 2, 3, 4, 5};
		int[] num2 = {1, 2, 100, -99, 1, 2, 3};
		
		int[] test1 = solution(num1);
		int[] test2 = solution(num2);
		
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
	}

}
