package basic;

public class 배열의평균값 {

	public static double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        answer = sum / numbers.length;
        return answer;
    }
	
	public static void main(String[] args) {
		int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] num2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		
		double test1 = solution(num1);
		double test2 = solution(num2);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);
	}

}
