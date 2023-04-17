package basic;

public class 삼각형의완성조건_1 {

	public static int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int maxIndex = 0;
        int sum = 0;
        for(int i = 0; i < 3; i++) {
            sum += sides[i];
            if(sides[i] > max) {
                max = sides[i];
                maxIndex = i;
            }
        }
        sum = sum - sides[maxIndex];
        if(sum > sides[maxIndex]) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] num1 = {1, 2, 3};
		int[] num2 = {3, 6, 2};
		int[] num3 = {199, 72, 222};
		
		int test1 = solution(num1);
		int test2 = solution(num2);
		int test3 = solution(num3);
		
		System.out.print("test1 : ");
		System.out.println(test1);
		
		System.out.print("test2 : ");
		System.out.println(test2);

		System.out.print("test3 : ");
		System.out.println(test3);
	}

}
